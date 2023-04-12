package com.trx.pattern.visitor.kpi.kpitest;

public class CTOVisitor implements  IVisitor{
    public void visit(Engineer engineer) {
        System.out.println("访问engineer kpi信息"+engineer.get()+"姓名："+engineer.getName());
    }

    public void visit(Manager manager) {

        System.out.println("访问manager kpi信息"+manager.get()+"姓名："+manager.getName());
    }
}
