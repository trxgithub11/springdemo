package com.trx.pattern.observer.gper.testgper;

import java.awt.geom.GeneralPath;
import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

    private  String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        Gper  gper = (Gper)o;
        Question  question =  (Question)arg;

        System.out.println(question.getUserName()+"在"+gper.getName()+"提一个问题希望"+name+"老师您能解答这个问题问题是"+question.getContent());


//        System.out.println()
    }
}
