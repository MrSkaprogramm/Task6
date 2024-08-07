package com.sfia.service.Impl;

import com.sfia.service.CustomHashSetInterface;
import com.sfia.utils.CustomHashSetIterator;

import java.util.Iterator;

public class CustomHashSet<T> implements Iterable<T>, CustomHashSetInterface<T> {
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private Node<T>[] data;
    private int size;

    public CustomHashSet() {
        this.data = new Node[INITIAL_CAPACITY];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public Node<T>[] getData() {
        return data;
    }

    public boolean contains(T element) {
        if (element == null) {
            int index = getIndex(element);
            return data[index] != null;
        } else {
            int index = getIndex(element);
            Node<T> curr = data[index];
            while (curr != null) {
                if (curr.getValue() != null && curr.getValue().equals(element)) {
                    return true;
                }
                curr = curr.getNext();
            }
            return false;
        }
    }

    public void put(T element) {
        if (element == null) {
            int index = getIndex(element);
            if (data[index] == null) {
                data[index] = new Node<>(null, null);
                size++;
            }
        } else if (!contains(element)){
            int index = getIndex(element);
            data[index] = new Node<>(element, data[index]);
            size++;
            if (size > data.length * LOAD_FACTOR) {
                resize();
            }
        }
    }

    public void delete(T element) {
        if (element == null) {
            int index = getIndex(element);
            if (data[index] != null) {
                data[index] = data[index].getNext();
                size--;
            }
        } else {
            int index = getIndex(element);
            Node<T> curr = data[index];
            Node<T> prev = null;
            while (curr != null) {
                if (curr.getValue().equals(element)) {
                    if (prev == null) {
                        data[index] = curr.getNext();
                    } else {
                        prev.setNext(curr.getNext());
                    }
                    size--;
                    return;
                }
                prev = curr;
                curr = curr.getNext();
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomHashSetIterator<>(this);
    }

    public int getIndex(T element) {
        if(element==null) {
            return 0;
        } else {
            return (element.hashCode() & 0x7FFFFFFF) % data.length;

        }
    }

    @Override
    public Node getNext(Node node) {
        return node.getNext();
    }

    public void setNext(Node node, Node next) {
        node.setNext(next);
    }

    public void resize() {
        Object[] oldData = data;
        data = new Node[data.length * 2];
        size = 0;
        for (Object node : oldData) {
            while (node != null) {
                put(((Node<T>)node).getValue());
                node = getNext((Node<T>) node);
            }
        }
    }
}
