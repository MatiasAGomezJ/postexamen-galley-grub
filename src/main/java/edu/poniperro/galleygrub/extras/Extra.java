package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

import java.util.Optional;

public abstract class Extra {

    Optional<Extra> nextExtra = Optional.ofNullable(null);

    public void setNextExtra(Extra extra) {
        this.nextExtra = Optional.of(extra);
    }

    public abstract void sumExtras(Comanda order);
}
