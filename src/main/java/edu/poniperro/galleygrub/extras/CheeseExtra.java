package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {

    @Override
    public void sumExtras(Comanda order) {
        for (Item item : order.itemList()) {
            if (!item.isRegular() && item.extra() == "cheese") {
                order.updateTotal(Prices.getPriceof(item.extra()));
            }
        }
    }
}
