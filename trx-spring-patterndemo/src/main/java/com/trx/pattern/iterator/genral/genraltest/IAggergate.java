package com.trx.pattern.iterator.genral.genraltest;

public interface IAggergate<E> {

    boolean add(E e);
    boolean remove(E e);

    Iterator<E> iterator();

}
