package com.trx.pattern.observer.gper;

public class Test {

    public static void main(String args[]){

        Gper  gper =Gper.getInstance();

        Teacher tom = new Teacher("tom");
        Teacher  jerry = new Teacher("jerry");
        gper.addObserver(tom);
        gper.addObserver(jerry);

        Questions  questions = new Questions();
        questions.setUserName("trx");

        questions.setContent("问题内容");

        gper.publishQuestion(questions);

    }
}
