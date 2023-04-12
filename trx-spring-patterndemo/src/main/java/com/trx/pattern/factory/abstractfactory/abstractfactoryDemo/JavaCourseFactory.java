package com.trx.pattern.factory.abstractfactory.abstractfactoryDemo;

public class JavaCourseFactory  extends CourseFactory{
    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
