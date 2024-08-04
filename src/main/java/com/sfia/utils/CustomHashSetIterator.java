package com.sfia.utils;
import com.sfia.service.Impl.CustomHashSet;
import com.sfia.service.Impl.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomHashSetIterator<T> implements Iterator<T> {
    private CustomHashSet<T> set;
    private int currentIndex;
    private Node<T> currentNode;

    public CustomHashSetIterator(CustomHashSet<T> set) {
        this.set = set;
        this.currentIndex = 0;
        this.currentNode = null;
        this.findNextNode();
    }

    private void findNextNode() {
        while (currentNode == null && currentIndex < set.getData().length) {
            currentNode = set.getData()[currentIndex++];
        }
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T value = currentNode.getValue();
        currentNode = currentNode.getNext();
        findNextNode();
        return value;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
