package com.sfia.utils;

import com.sfia.service.Impl.CustomArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayListIterator<T> implements Iterator<T> {
    private final CustomArrayList<T> list;
    private int index = 0;

    public CustomArrayListIterator(CustomArrayList<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.getByIndex(index++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
