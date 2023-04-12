package com.trx.pattern.iterator.genral.genraltest;


import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args) {
//        IAggergate<String>  aggregate  = new ConcreteAggregate<String>();
//        aggregate.add("a");
//        aggregate.add("b");
//        aggregate.add("c");
//
//        Iterator<String> iterator =  aggregate.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }



        List list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");

        if(list.iterator().hasNext()){

            System.out.println(list.iterator().next());
        }
    }
}
