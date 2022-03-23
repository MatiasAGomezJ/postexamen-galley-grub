package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

import java.util.Optional;

public class SizeLargeExtra extends Extra {

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> sizeCharge = order.itemList().stream()
                .filter(item -> item.extra().equalsIgnoreCase(Prices.LARGE.name()))
                .map(item -> Prices.LARGE.getExtra())
                .reduce(Double::sum);

        if (sizeCharge.isPresent()) {
            order.updateTotal(sizeCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }
}
