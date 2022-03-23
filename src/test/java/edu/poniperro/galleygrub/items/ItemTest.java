package edu.poniperro.galleygrub.items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    public Item item;
    public String nombre;
    public Double price;
    public String extra;

    @Test
    public void testToStringWithoutExtra() {
        Prices.init_prices();
        nombre = "Hamborguesa";
        price = 50.00;
        item = new Item(nombre, price);
        String output = nombre + "...." + price + "$";
        assertEquals(output, item.toString());
    }

    @Test
    public void testToStringWithExtra() {
        Prices.init_prices();
        nombre = "Hamborguesa";
        price = 50.00;
        extra = "cheese"; // precio = 0.25
        item = new Item(nombre, price, extra);
        String output = nombre + " w/ cheese...." + price + "$ + 0.25$";
        assertEquals(output, item.toString());
    }

    @Test
    public void equals_test() {

        Item patty = new Item("Krabby Patty", 1.25);
        Item kpatty = new Item("Krabby Patty", 1.25);

        assertTrue(patty.equals(kpatty));

    }
}