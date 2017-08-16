package Tuple;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 21:20.
 */
public class Tuple<T extends Comparable<T>,P extends Comparable<P>> implements TupleInterface {
    private T firstItem;
    private P secondItem;

    public Tuple(T firstItem, P secondItem) {
        this.setFirstItem(firstItem);
        this.setSecondItem(secondItem);
    }

    @Override
    public Comparable getFirstItem() {
        return this.firstItem;
    }

    @Override
    public Comparable getSecondItem() {
        return this.secondItem;
    }

    private void setFirstItem(T firstItem) {
        this.firstItem=firstItem;
    }

    private void setSecondItem(P secondItem) {
        this.secondItem=secondItem;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s",this.getFirstItem(),this.getSecondItem());
    }
}
