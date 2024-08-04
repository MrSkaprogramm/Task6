package com.sfia.service;

import com.sfia.service.Impl.Node;

public interface CustomHashSetInterface<T> {
    int size();

    boolean contains(T element);

    void put(T element);

    void delete(T element);

    int getIndex(T element);

    Node getNext(Node node);

    void setNext(Node node, Node next);

    void resize();
}
