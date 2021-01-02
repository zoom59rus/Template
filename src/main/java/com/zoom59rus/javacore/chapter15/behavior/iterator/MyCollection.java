package com.zoom59rus.javacore.chapter15.behavior.iterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class MyCollection<T> implements java.lang.Iterable<T> {
    private String entity;
    private T[] elements;

    public MyCollection(String entity, T[] elements) {
        this.entity = entity;
        this.elements = elements;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new MyCollectionIterable();
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    private class MyCollectionIterable implements java.util.Iterator<T> {
        int index;
        private T[] cloneCollections;

        public MyCollectionIterable() {
            this.cloneCollections = elements.clone();
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer action) {

        }

        @Override
        public boolean hasNext() {
            if(index < cloneCollections.length){
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            return cloneCollections[index++];
        }
    }
}
