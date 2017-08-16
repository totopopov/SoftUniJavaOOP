package Threeuple;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 21:20.
 */
public class ThreeupleImpl<T extends Comparable<T>,P extends Comparable<P>,M extends Comparable<M>> implements Threeuple {
    private T firstItem;
    private P secondItem;
    private M thirdItem;


    public ThreeupleImpl(T firstItem, P secondItem,M thirdItem) {
        this.setFirstItem(firstItem);
        this.setSecondItem(secondItem);
        this.setThirdItem(thirdItem);
    }

    @Override
    public Comparable getFirstItem() {
        return this.firstItem;
    }

    @Override
    public Comparable getSecondItem() {
        return this.secondItem;
    }

    @Override
    public Comparable getThirdItem() {
        return this.thirdItem;
    }


    private void setFirstItem(T firstItem) {
        this.firstItem=firstItem;
    }

    private void setSecondItem(P secondItem) {
        this.secondItem=secondItem;
    }
    private void setThirdItem(M thirdItem) {
        this.thirdItem = thirdItem;
    }
    @Override
    public String toString() {
        return String.format("%s -> %s -> %s"
                ,this.getFirstItem(),this.getSecondItem(),this.getThirdItem());
    }
}
