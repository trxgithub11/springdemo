package com.trx.pattern.factory.abstractfactory.abstractfactoryDemo;

public abstract  class CourseFactory {

    public void init(){

        System.out.println("数据初始化");
    }

    public abstract  INote createNote();
    public abstract  IVideo createVideo();
}
