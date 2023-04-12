package com.trx.pattern.factory.factorypool;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class ConManager {

    private static Pool dbPool;
    private static ConManager intance = null;

    public ConManager() {
    }

    protected static void closeCon(Connection con){

    }

    private static ConManager getInstance(){

        if(null==intance){

            intance = new ConManager();
        }

        return intance;

    }

    public static Connection getConnection(){

        Connection conn = null;

        if(dbPool==null){

            dbPool = DBConnectionPool.getInstance();

        }
        conn = dbPool.getConnection();

        return conn;
    }

    protected  static Connection getConnection(String lookupStr){
        Connection conn = null;
        try {

            ConManager.getInstance();
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup(lookupStr);
            conn = ds.getConnection();
        }catch(Exception e){


        }
        return conn;
        }


























}
