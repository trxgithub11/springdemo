package com.trx.pattern.observer.gper;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {


    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {


        Gper  gper =(Gper)o;
        Questions   questions = (Questions) arg;

        System.out.println(name+"老师您好您收到一个来自"+gper.getName()+"的提问，希望您能解答内容如下"+questions.getContent()+"提问者="+questions.getUserName());
    }
}
