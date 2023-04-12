package com.trx.pattern.factory.factorymethod.factorymethoddemo;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
