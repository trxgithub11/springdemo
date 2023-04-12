package com.trx.pattern.factory.factorymethod;

public class JavaCourseFactory implements ICourseFactory{


    public ICourse create() {
        return new JavaCourse();
    }
}
