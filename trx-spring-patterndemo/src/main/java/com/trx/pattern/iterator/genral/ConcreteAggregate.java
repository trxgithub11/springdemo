package com.trx.pattern.iterator.genral;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<E> implements IAggregate<E> {

    private List<E> list = new ArrayList<E>();
    public boolean add(E element) {
        return this.list.add(element);
    }

    public boolean remove(E element) {
        return this.list.remove(element);
    }

    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(this.list);
    }
}
