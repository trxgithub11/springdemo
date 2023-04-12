package com.trx.pattern.visitor.kpi.kpitest;

public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract  void accept(IVisitor visitor);
}
