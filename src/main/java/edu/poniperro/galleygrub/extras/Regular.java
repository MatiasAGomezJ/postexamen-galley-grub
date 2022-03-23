package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

import java.util.Optional;

public class Regular extends Extra {

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> sumRegularPrices = order.itemList().stream()
                .map(Item::price)
                .reduce(Double::sum);

        if (sumRegularPrices.isPresent()) {
            order.updateTotal(sumRegularPrices.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }
}
