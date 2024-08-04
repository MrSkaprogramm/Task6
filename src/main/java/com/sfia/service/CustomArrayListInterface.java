package com.sfia.service;
public interface CustomArrayListInterface<T> {
    public int size();

    public void put(T element);

    public void put(int index, T element);

    public T getByIndex(int index);

    public T deleteByIndex(int index);

    void resize();

}
