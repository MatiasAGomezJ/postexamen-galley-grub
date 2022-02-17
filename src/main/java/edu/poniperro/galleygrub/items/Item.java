package edu.poniperro.galleygrub.items;

public class Item implements Product {
    String name;
    Double price;
    String extra = "";

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return extra.isEmpty() ? extra.isEmpty() : false;
    }

    @Override
    public String toString() {
        String output= "";

        // Añade el nombre y si tiene extra tambien
        output += isRegular() ? name() : name() + " w/ " + extra();

        // Separador
        output += "....";

        // Añade el precio y si tiene extra tambien
        output += isRegular() ? price() + "$" : price() + Prices.getPriceof(extra) + "$";

        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            return this.name.equals(((Item) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
