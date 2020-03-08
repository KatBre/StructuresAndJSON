package Structures.ex2;

import java.util.Comparator;

public class OfferComparator implements Comparator<Offer> {
    private boolean decreasing;
    public OfferComparator(boolean decreasing) {
        this.decreasing = decreasing;
    }



    @Override
    public int compare(Offer o1, Offer o2) {
        if (decreasing) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        } else {
            return Double.compare(o2.getPrice(), o1.getPrice());
        }
//        return Double.compare(o1.getPrice(), o2.getPrice() * (decreasing ? 1 : -1)); // inny sposób zapisu
    }
}
