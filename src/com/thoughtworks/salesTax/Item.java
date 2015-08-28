package com.thoughtworks.salesTax;

public class Item {
    private String name;
    private double cost;
    private boolean isTaxable;
    private boolean isImported;

    public Item(String name, double cost, boolean isTaxable, boolean isImported) {
        this.name = name;
        this.cost = cost;
        this.isTaxable = isTaxable;
        this.isImported = isImported;
    }

    public double netAmount() {
        return cost;
    }
}
