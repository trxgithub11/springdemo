package com.trx.pattern.builder.chain;

public class Test {

    public static void main(String args[]){

        CourseBuilder  builder  = new CourseBuilder()
                .addName("设计模式")
                .addPpt("ppt课件")
                .addNote("课堂笔记")
                .addVide("回放视频").addHomework("课后作业");

        System.out.println(builder.build());
    }
}
