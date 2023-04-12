package com.trx.pattern.interpreter.general.generaltest;

public class ExpressionImpl implements  IExpression{
    private String data;

    public ExpressionImpl(String data) {
        this.data = data;
    }

    public boolean interpter(String context) {

        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
