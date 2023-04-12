package com.trx.pattern.interpreter.general.generaltest;

public class OrExpression implements IExpression{

    private IExpression expr1;
    private IExpression expr2;

    public OrExpression(IExpression expr1, IExpression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpter(String context) {
        return expr1.interpter(context)||expr2.interpter(context);
    }
}
