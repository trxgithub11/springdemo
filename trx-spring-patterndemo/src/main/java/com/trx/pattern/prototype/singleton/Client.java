package com.trx.pattern.prototype.singleton;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String args[]){

        ConcreatePrototype  prototype = ConcreatePrototype.getInstance();
        prototype.setAge(18);
        prototype.setName("tom");
        List<String> hobies = new ArrayList<String>();
        hobies.add("书法");
        hobies.add("美术");
        prototype.setHobbies(hobies);

        ConcreatePrototype cloneType = prototype.clone();

        cloneType.getHobbies().add("技术控");



        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + cloneType);
        System.out.println(prototype == cloneType);


        System.out.println("原型对象的爱好：" + prototype.getHobbies());
        System.out.println("克隆对象的爱好：" + cloneType.getHobbies());
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());





































    }
}
