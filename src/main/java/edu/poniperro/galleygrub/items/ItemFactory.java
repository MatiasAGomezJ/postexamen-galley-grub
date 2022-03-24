package edu.poniperro.galleygrub.items;

import java.util.HashMap;

public class ItemFactory {

    private static HashMap<String, Item> itemMap = new HashMap<>();

//    !itemMap.isEmpty() &&

    public static Item getItem(String name, double price) {
        Item item;
        if (itemMap.containsKey(name)){
            item = itemMap.get(name);
            if(item.name() == name && item.price() == price) {
                return itemMap.get(name);
            }
        }
        item = new Item(name, price);
        itemMap.put(name, item);
        return item;
    }

    public static Item getItem(String name, double price, String extra) {
        Item item;
        if (itemMap.containsKey(name)){
            item = itemMap.get(name);
            if(item.name() == name && item.price() == price && item.extra() == extra) {
                return itemMap.get(name);
            }
        }
        item = new Item(name, price, extra);
        itemMap.put(name, item);
        return item;
    }

    public static int size() {
        return itemMap.size();
    }

    public static void clear() {
        itemMap.clear();
    }
}
