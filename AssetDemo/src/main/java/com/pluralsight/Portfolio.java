package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable valuableThing) {
        this.valuables.add(valuableThing);
    }

    public double getValue() {
        double total = 0;
        for (FixedAsset fa : valuables){
            total += fa.getValue();
        }
        return total;
    }
}
