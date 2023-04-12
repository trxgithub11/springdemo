package com.trx.pattern.factory.factorypool;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;


public class DBConnectionPool extends Pool{

    private int checkedOut;
    private Vector<Connection> freeConnections = new Vector<Connection>();

    private String passWord = null;
    private String url = null;
    private String userName = null;
    private String driverName=null;

    private static int  num=0;
    private static int numActive=0;


    private static DBConnectionPool pool = null;
    public static synchronized  DBConnectionPool getInstance(){

        if(pool==null){

            pool = new DBConnectionPool();
        }

        return pool;
    }

    public DBConnectionPool() {

        try{
            init();
            for (int i=0;i<normalConnect;i++){

                Connection c = newConnection();
                if(c!=null){

                    freeConnections.addElement(c);
                }
            }

        }catch (Exception  e){


        }
    }


    private void init() throws IOException {

        InputStream  is = DBConnectionPool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(is);
        this.userName = p.getProperty("userName");
        this.passWord = p.getProperty("passWord");
        this.driverName = p.getProperty("driverName");
        this.url = p.getProperty("url");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));

    }

    public synchronized  void freeConnection(Connection con){

        freeConnections.addElement(con);
        num++;
        checkedOut++;
        numActive--;
        notifyAll();;
    }



    public int getnum(){return num;};
    public int getnumActive(){return numActive;}
    private Connection newConnection() {

        Connection con = null;
        try{

            if(userName==null){

                con = DriverManager.getConnection(url);

            }else{

                con = DriverManager.getConnection(url,userName,passWord);
            }

            System.out.println("连接池创建一个新的连接");
        }catch (Exception e){



        }

        return con;
    }


    public synchronized Connection getConnection() {
        Connection con = null;
        if (freeConnections.size() > 0) { // 还有空闲的连接
            num--;
            con = (Connection) freeConnections.firstElement();
            freeConnections.removeElementAt(0);
            try {
                if (con.isClosed()) {
                    System.out.println("从连接池删除一个无效连接");
                    con = getConnection();
                }
            } catch (SQLException e) {
                System.out.println("从连接池删除一个无效连接");
                con = getConnection();
            }
        } else if (maxConnect == 0 || checkedOut < maxConnect) { // 没有空闲连接且当前连接小于最大允许值,最大值为0则不限制
            con = newConnection();
        }
        if (con != null) { // 当前连接数加1
            checkedOut++;
        }
        numActive++;
        return con;
    }




    public synchronized Connection getConnection(long timeout) {
        long startTime = new Date().getTime();
        Connection con;
        while ((con = getConnection()) == null) {
            try {
                wait(timeout); //线程等待
            } catch (InterruptedException e) {
            }
            if ((new Date().getTime() - startTime) >= timeout) {
                return null; // 如果超时,则返回
            }
        }
        return con;
    }

    /**
     * 关闭所有连接
     */
    public synchronized void release() {
        try {
            //将当前连接赋值到 枚举中
            Enumeration allConnections = freeConnections.elements();
            //使用循环关闭所用连接
            while (allConnections.hasMoreElements()) {
                //如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素
                Connection con = (Connection) allConnections.nextElement();
                try {
                    con.close();
                    num--;
                } catch (SQLException e) {
                    System.out.println("无法关闭连接池中的连接");
                }
            }
            freeConnections.removeAllElements();
            numActive = 0;
        } finally {
            super.release();
        }
    }

    /**
     * 建立连接池
     */
    public void createPool() {

        pool = new DBConnectionPool();
        if (pool != null) {
            System.out.println("创建连接池成功");
        } else {
            System.out.println("创建连接池失败");
        }
    }




























}
