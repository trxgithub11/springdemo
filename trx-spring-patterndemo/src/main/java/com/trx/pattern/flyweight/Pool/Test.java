package com.trx.pattern.flyweight.Pool;

import java.sql.Connection;

public class Test {

    public  static void main(String args[]){

        ConnectionPool  connectionPool = new ConnectionPool();
        Connection conn =connectionPool.getConnection();

        connectionPool.release(conn);
        System.out.println( connectionPool.getCount());

    }
}
