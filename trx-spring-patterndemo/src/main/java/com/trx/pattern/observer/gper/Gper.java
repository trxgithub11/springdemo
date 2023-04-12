package com.trx.pattern.observer.gper;

import java.util.Observable;

public class Gper extends Observable {

    private String name = "Gper生态圈";
    private static final Gper gper = new Gper();
    private Gper(){}

    public static Gper getInstance(){return gper;}


    public String getName(){

        return name;
    }

   public void publishQuestion(Questions questions){


        System.out.println(questions.getUserName()+"在"+this.name+"上提交一个问题");
        setChanged();
        notifyObservers(questions);
   }
}
