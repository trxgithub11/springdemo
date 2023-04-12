package com.trx.pattern.factory.factorymethod;

public class PythonCourseFactory implements ICourseFactory{
    public ICourse create() {
        return new PythonCourse();
    }
}
