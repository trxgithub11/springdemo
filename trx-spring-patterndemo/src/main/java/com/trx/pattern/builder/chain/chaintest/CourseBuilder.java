package com.trx.pattern.builder.chain.chaintest;

import lombok.Data;

public class CourseBuilder {


    private Course course = new Course();

    public CourseBuilder addName(String name){course.setName(name); return this;}
    public CourseBuilder addNote(String note){course.setNote(note);return this;}
    public CourseBuilder addPpt(String ppt){course.setPpt(ppt);return this;}
    public Course  builder(){

        return this.course;
    }

    @Data
    private class Course{

        private String name;
        private String note;
        private String ppt;

    }
}
