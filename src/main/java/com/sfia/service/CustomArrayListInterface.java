package com.sfia.service;
public interface CustomArrayListInterface<T> {
    int size();

    void put(T element);

    void put(int index, T element);

    T getByIndex(int index);

    T deleteByIndex(int index);

    void resize();
}
