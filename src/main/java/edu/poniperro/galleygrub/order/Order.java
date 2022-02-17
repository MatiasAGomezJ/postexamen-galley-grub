package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;

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
        return null;
    }

    @Override
    public void updateTotal(Double d) {

    }

    @Override
    public void display() {
        String output = "\n\t --- ORDER ---  \n";
        for (Item item : items) {
            output += "\t" + item.name() + "...." + item.price() + "$\n";
        }
        System.out.println(output);
    }

    private void itemDisplay(Item item) {
        item.toString();
    }
}
