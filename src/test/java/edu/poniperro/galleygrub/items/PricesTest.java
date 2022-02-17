package edu.poniperro.galleygrub.items;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PricesTest {

    @Test
    public void testGetPriceof() {
        Prices.init_prices();
        String extra = "cheese";
        Double precio = 0.25;
        assertEquals(precio, Prices.getPriceof(extra), 0);
    }
}