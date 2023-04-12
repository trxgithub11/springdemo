package com.trx.pattern.factory.abstractfactory.abstractfactoryDemo;

public class abstractfactorydemoTest {

    public static void main(String args[]){

        JavaCourseFactory  javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createVideo().record();
        javaCourseFactory.createNote().edit();
    }
}
