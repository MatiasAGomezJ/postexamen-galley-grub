package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public enum Prices {
    CHEESE(0.25),
    SAUCE(0.5),
    MEDIUM(0.25),
    LARGE(0.5);

    Double extra;

    private Prices(Double extra) {
        this.extra = extra;
    }

    public static void init_prices() {
    }

    public static void display() {
        String output = "";
        for (Prices price: Prices.values()) {
            output += "\t" + price.name() + "...." + price.extra + "$\n";
        }
        System.out.println(output);
    }

    public static Double getPriceof(String itemName) {
        itemName = itemName.toUpperCase();
        return containsName(itemName) ? Prices.valueOf(itemName).getExtra() : 0.0;
    }

    private static boolean containsName(String itemName) {
        for (Prices price: Prices.values()) {
            if (price.name().equals(itemName)) {
                return true;
            }
        }
        return false;
    }

    public Double getExtra() {
        return extra;
    }
}
