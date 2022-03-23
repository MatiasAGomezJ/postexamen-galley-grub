package edu.poniperro.galleygrub.items;

import java.util.HashMap;

public class ItemFactory {

    private static HashMap<String, Item> itemMap;

    public ItemFactory() {
        itemMap = new HashMap<>();
    }

    public static Item getItem(String name, double price) {
         if (itemMap.containsKey(name)){
             return itemMap.get(name);
         }
         return new Item(name, price);
    }

    public static Item getItem(String name, double price, String extra) {
        if (itemMap.containsKey(name)){
            return itemMap.get(name);
        }
        return new Item(name, price, extra);
    }

    public static int size() {
        return itemMap.size();
    }

    public static void clear() {
        itemMap.clear();
    }
}
