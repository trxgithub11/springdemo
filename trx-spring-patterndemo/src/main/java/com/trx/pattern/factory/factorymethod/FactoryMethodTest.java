package com.trx.pattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String args[]){

        ICourseFactory  factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }
}
