package com.trx.pattern.prototype.singleton;

import lombok.Data;

import java.util.List;
@Data
public class ConcreatePrototype implements Cloneable{

    private int age;
    private String name;
    private List<String> hobbies;
    private static ConcreatePrototype  instance = new ConcreatePrototype();
    private ConcreatePrototype(){}

    public static  ConcreatePrototype  getInstance(){

        return instance;
    }

    public  ConcreatePrototype clone()  {
        return instance;
    }

    @Override
    public String toString() {
        return "ConcreatePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
