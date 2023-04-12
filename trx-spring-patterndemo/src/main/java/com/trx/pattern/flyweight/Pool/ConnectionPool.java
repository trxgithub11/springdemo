package com.trx.pattern.flyweight.Pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {

    private static Vector   pool = new Vector();

    private static final  String url = "jdbc:mysql://localhost:3306/shop";

    public ConnectionPool() {

        if(pool.isEmpty()){
            try{

                Class.forName("com.mysql.jdbc.Driver");
                for(int i=0;i<5;i++) {

                    Connection con = DriverManager.getConnection(url, "root", "admin");
                    pool.add(con);
                }
            }catch(Exception e){
                e.printStackTrace();

            }

        }
    }

    public Connection  getConnection(){
        Connection con = (Connection)pool.get(0);
        pool.remove(con);
        return con;
    }


    public int getCount(){

      return  pool.size();
    }
    public void release(Connection con){

        pool.add(con);
    }
}
