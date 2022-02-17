package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {

    private List<Item> items = new ArrayList<>();
    private double total;

    @Override
    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        items.add(new Item(name, price, extra));
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List<Item> itemList() {
        return null;
    }

    @Override
    public Double getTotal() {
        return total;
    }

    @Override
    public void updateTotal(Double d) {

    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER ---  ");
        for (Item item : items) {
            itemDisplay(item);
        }
    }

    private void itemDisplay(Item item) {
        System.out.println("\t" + item.toString());
    }
}
