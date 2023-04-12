package com.trx.pattern.factory.simplefactory.simplefactorydemo;

public class CourseFactory {

    public ICourse  getCourse(Class<? extends  ICourse> o){
        ICourse iCourse =null;
       try {
           if (null != o) {

               return  o.newInstance();
           }


       }catch(Exception w){


       }
        return  null;
    }
}
