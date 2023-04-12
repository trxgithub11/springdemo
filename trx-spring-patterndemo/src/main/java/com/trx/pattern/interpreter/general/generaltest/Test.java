package com.trx.pattern.interpreter.general.generaltest;

public class Test {

    public static void main(String[] args) {
        String manContext = "joinorrorobert";
        String julieContext = "juliemarried";

        IExpression  join = new ExpressionImpl("join");
        IExpression robert = new ExpressionImpl("robert");
        IExpression  isMaln = new OrExpression(join,robert);

        IExpression  julie = new ExpressionImpl("julie");
        IExpression married = new ExpressionImpl("married");
        IExpression  isMarried = new AndExpression(julie,married);

        System.out.println(isMaln.interpter(manContext));
        System.out.println(isMarried.interpter(julieContext));

    }
}
