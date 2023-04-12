package com.trx.pattern.visitor.kpi;

import java.util.Random;

public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProducts(){return new Random().nextInt(10);
    }
}
