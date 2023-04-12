package com.trx.pattern.factory.factorymethod.factorymethoddemo;

public class PythonCourseFactory implements ICourseFactory{
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
