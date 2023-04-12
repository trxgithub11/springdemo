package com.trx.pattern.builder.chain.chaintest;

public class Test {


    public  static void  main(String [] args) {
        CourseBuilder courseBuilder = new CourseBuilder()
                .addName("课程名称")
                .addNote("课程笔记")
                .addPpt("课程ppt");

        System.out.println(courseBuilder.builder());

    }
}
