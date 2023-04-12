package com.trx.pattern.factory.factorymethod.factorymethoddemo;

public class FactoryMethodDemoTest {

    public static void main(String args[]){

        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course =    courseFactory.createCourse();

        course.record();


        courseFactory = new PythonCourseFactory();
        course =    courseFactory.createCourse();

        course.record();

    }
}
