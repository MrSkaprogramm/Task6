package com.sfia.service.Impl;

import com.sfia.service.CustomArrayListInterface;
import com.sfia.utils.CustomArrayListIterator;

import java.util.Iterator;

public class CustomArrayList<T> implements CustomArrayListInterface<T>, Iterable<T>{
    private static final int DEFAULT_CAPACITY = 10;

    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomArrayList() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void put(T element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    public void put(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == data.length) {
            resize();
        }
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    public T getByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public T deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T oldValue = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        return oldValue;
    }

    @SuppressWarnings("unchecked")
    public void resize() {
        int newCapacity = (int) (data.length * 1.5) + 1;
        T[] newData = (T[]) new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomArrayListIterator<>(this);
    }
}
