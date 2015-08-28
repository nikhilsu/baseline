package com.thoughtworks.salesTax;

public class Cashier {

    public double computeFinalBill(Item item) {
        if (item == null)
            return 0;
        else return item.netAmount();
    }
}
