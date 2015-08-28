package com.thoughtworks.salesTax;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void mustProduceABillWithValueZeroWhenNoItemsAreGiven() {
        Cashier cashier = new Cashier();

        assertEquals(0.0 , cashier.computeFinalBill(null), 0);
    }

    @Test
    public void mustProduceABillOfTenWhenAnItemWhichIsNotTaxableNorIsImportedAndCostsTenIsPurchased() {
        Cashier cashier = new Cashier();
        Item item = new Item("Book", 10.0, false, false);

        assertEquals(10.0, cashier.computeFinalBill(item), 0);
    }
}
