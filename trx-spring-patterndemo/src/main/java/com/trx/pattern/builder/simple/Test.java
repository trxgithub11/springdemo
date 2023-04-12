package com.trx.pattern.builder.simple;

public class Test {

    public static void main(String[] args){


        CourseBuilder courseBuilder = new CourseBuilder();
        courseBuilder.addName("课程名称");
        courseBuilder.addPpt("课程ppt");
        courseBuilder.addNote("课程笔记");
        courseBuilder.addVideo("课程回访");
        courseBuilder.addHomework("课后作业");
        Course  course = courseBuilder.builer();
        System.out.println(course);
    }
}
