package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class Regular extends Extra {

    @Override
    public void sumExtras(Comanda order) {

        // Suma orders
        for (Item item : order.itemList()) {
            order.updateTotal(item.price());
        }

        // Llama al siguiente item
    }
}
