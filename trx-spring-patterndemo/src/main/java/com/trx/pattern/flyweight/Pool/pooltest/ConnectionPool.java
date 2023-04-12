package com.trx.pattern.flyweight.Pool.pooltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {

    private Vector  pool = null;

    private int poolSize=5;
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String url="jdbc:mysql://localhost:3306/shop";
    private final String userName="root";
    private final String password="admin";
    public ConnectionPool() {

        pool = new Vector(poolSize);
        try{

            Class.forName(driverName);
            for (int i=0;i<poolSize;i++){

                Connection  conn = DriverManager.getConnection(url,userName,password);

                pool.add(conn);
            }
        }catch(Exception e){
            e.printStackTrace();;
        }

    }


    public synchronized  Connection  getConnection(){

        if(pool.size()>0){

            Connection  conn = (Connection)pool.get(0);
            pool.remove(conn);
            return conn;
        }

        return null;
    }

    public void release(Connection conn){

        pool.add(conn);
    }

    public int getCount(){

        return pool.size();
    }
}
