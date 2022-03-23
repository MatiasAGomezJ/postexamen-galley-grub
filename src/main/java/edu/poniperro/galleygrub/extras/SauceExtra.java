package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

import java.util.Optional;

public class SauceExtra extends Extra {

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> sauceCharge = order.itemList().stream()
                .filter(item -> item.extra().equalsIgnoreCase(Prices.SAUCE.name()))
                .map(item -> Prices.SAUCE.getExtra())
                .reduce(Double::sum);

        if (sauceCharge.isPresent()) {
            order.updateTotal(sauceCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }
}
