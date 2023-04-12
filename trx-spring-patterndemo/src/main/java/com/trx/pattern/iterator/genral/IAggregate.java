package com.trx.pattern.iterator.genral;

public interface IAggregate<E> {

    boolean add(E element);
    boolean remove(E element);

    Iterator<E>  iterator();
}
