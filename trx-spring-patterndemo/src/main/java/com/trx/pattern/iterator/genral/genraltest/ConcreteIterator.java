package com.trx.pattern.iterator.genral.genraltest;

import java.util.List;

public class ConcreteIterator<E> implements Iterator<E>{

    List<E>  list = null;

    private int cusor=0;
    public ConcreteIterator(List list) {
        this.list = list;
    }

    public E next() {
        return this.list.get(cusor++);
    }

    public boolean hasNext() {

        return this.cusor<this.list.size();
    }
}
