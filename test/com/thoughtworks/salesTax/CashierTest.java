package com.thoughtworks.salesTax;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void mustProduceABillWithValueZeroWhenNoItemsAreGiven() {
        Cashier cashier = new Cashier();

        assertEquals(0.0 , cashier.computeFinalBill(), 0);
    }
}
