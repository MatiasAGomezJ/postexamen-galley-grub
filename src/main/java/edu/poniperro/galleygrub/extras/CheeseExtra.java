package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

import java.util.Optional;

public class CheeseExtra extends Extra {

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> cheeseCharge = order.itemList().stream()
                .filter(item -> item.extra().equalsIgnoreCase(Prices.CHEESE.name()))
                .map(item -> Prices.CHEESE.getExtra())
                .reduce(Double::sum);

        if (cheeseCharge.isPresent()) {
            order.updateTotal(cheeseCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));

    }
}
