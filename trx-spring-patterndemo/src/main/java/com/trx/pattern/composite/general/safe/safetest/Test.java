package com.trx.pattern.composite.general.safe.safetest;

public class Test {

    public static void main(String[] args) {

        Composite  root  = new Composite("root");
        Composite  branchA  = new Composite("----branchA");
        Composite  branchB  = new Composite("----branchB");

        Component leafA = new Leaf("--------leafA");
        Component leafB = new Leaf("--------leafB");
        Component leafC = new Leaf("--------leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);
        branchB.addChild(leafC);
        String result = root.operation();
        System.out.println(result);
    }
}
