package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.ItemFactory;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {

    private List<Item> items = new ArrayList<>();
    private double total;

    public Order() {
        ItemFactory.clear();
    }

    @Override
    public void addItem(String name, double price) {
        items.add(ItemFactory.getItem(name, price));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        items.add(ItemFactory.getItem(name, price, extra));

    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public List<Item> itemList() {
        return items;
    }

    @Override
    public Double getTotal() {
        return total;
    }

    @Override
    public void updateTotal(Double price) {
        total += price;
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
