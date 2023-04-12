package com.trx.pattern.visitor.kpi;

public class Test {
    public static void main(String[] args) {
        BusinessReport  report = new BusinessReport();
        report.showReport(new CEOVisitor());


        report.showReport(new CTOVisitor());
    }
}
