package com.trx.pattern.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton(){}
    private static  Map<String,Object> ioc =  new ConcurrentHashMap<String, Object>();

    public static  Object getInstance(String className){


        Object instance = null;

        if(!ioc.containsKey(className)){

            try{

                instance = Class.forName(className).newInstance();

                ioc.put(className,instance);


            }catch(Exception we){


            }
            return instance;
        }else{

            return  ioc.get(className);
        }

    }
}
