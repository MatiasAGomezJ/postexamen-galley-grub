package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {

    private static final Map<String, Double> prices = new HashMap<>();

    public static void init_prices() {
        prices.put("cheese", 0.25);
        prices.put("sauce", 0.5);
        prices.put("medium", 0.25);
        prices.put("large", 0.5);
    }

    public static void display() {
        String output = "";
        for (Map.Entry<String, Double> pair : prices.entrySet()) {
            output += "\t" + pair.getKey() + "...." + pair.getValue() + "$\n";
        }
        System.out.println(output);
    }

    public static Double getPriceof(String itemName) {
        return prices.containsKey(itemName) ? prices.get(itemName) : 0.0;
    }
}
