package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {

    private Comanda order;
    private Double total = 0.00;
    private Extra firstExtra;

    public Receipt(Comanda order) {
        this.order = order;
        this.total = order.getTotal();
    }

    @Override
    public Comanda getOrder() {
        return order;
    }

    @Override
    public void setChain(Extra extra) {
        firstExtra = extra;
    }

    @Override
    public Extra getChain() {
        return firstExtra;
    }

    @Override
    public Double total() {
        if (this.total == 0d) {
            this.sumExtrasCharge();
            this.total = this.getOrder().getTotal();
        }
        return this.total;
    }

    @Override
    public void sumExtrasCharge() {
        if (getChain() != null) {
            getChain().sumExtras(getOrder());
        }
    }

    @Override
    public void print() {
        order.display();
        System.out.println("\tTOTAL --------> " + total() + "$\n");
    }
}
