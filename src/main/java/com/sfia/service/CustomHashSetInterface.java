package com.sfia.service;

import com.sfia.service.Impl.Node;

public interface CustomHashSetInterface<T> {
    public int size();

    public boolean contains(T element);

    public void put(T element);

    public void delete(T element);

    int getIndex(T element);

    Node getNext(Node node);

    void setNext(Node node, Node next);

    void resize();
}
