package com.pluralsight.collection;

import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(List<T> item) {

    }

    public List<T> getItems() {
        return items;
    }
}
