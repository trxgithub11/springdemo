package com.trx.pattern.factory.simplefactory.simplefactorydemo;

public class TestFactory {

    public static void main(String args[]){


        CourseFactory  courseFactory = new CourseFactory();
        ICourse  iCourse  =  courseFactory.getCourse(JavaCourse.class);
        iCourse.record();
    }
}
