package com.trx.pattern.visitor.kpi;

import java.util.Random;

public abstract  class Employee {

    public String name;
    public int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract  void accept(IVisitor visitor);
}
