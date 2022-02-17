package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

import java.util.Optional;

public abstract class Extra {
    static final String CHEESE = "";
    static final String SAUCE = "";
    static final String SIZE_LARGE = "";
    String extraProduct;
    Optional<Extra> nextExtra;

    public void setNextExtra(Extra extra) {
        nextExtra = Optional.ofNullable(extra);
    }

    public abstract void sumExtras(Comanda order);
}
