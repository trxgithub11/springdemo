package com.trx.pattern.factory.simplefactory;

public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){

        try {
            if (null != clazz) {

                return clazz.newInstance();
            }
        }catch(Exception e){

        }

        return null;
    }
}
