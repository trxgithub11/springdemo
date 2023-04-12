package com.trx.pattern.iterator.genral;

import java.util.List;

public class ConcreteIterator<E> implements  Iterator<E>{

    private List<E> list;
    private int cursor = 0;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }

    public E next() {
        return this.list.get(this.cursor++);
    }

    public boolean hasNext() {
        return this.cursor<this.list.size();
    }
}
