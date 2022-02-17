package edu.poniperro.galleygrub.items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    public Item item;
    public String nombre;
    public Double price;

    @Before
    public void iniialize(){
        nombre = "Hamborguesa";
        price = 50.00;
        item = new Item(nombre, price);
    }
    @Test
    public void testToString() {
        String output = nombre + "...." + price + "$";
        assertEquals(output, item.toString());
    }
}