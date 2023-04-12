package com.trx.pattern.visitor.kpi.kpitest;

public interface IVisitor {

    void visit(Engineer engineer);
    void visit(Manager manager);

}
