package GenericBox;


/**
 * Created by Todor Popov using Lenovo on 18.3.2017 г. at 3:53.
 */
public class Box<T extends Comparable<T>> implements BoxInterface{
    private T elementInBox;

    public Box(T elementInBox) {
        this.elementInBox=elementInBox;
    }

    @Override
    public T getElementInBox() {
        return elementInBox;
    }

    @Override
    public String toString() {
        return this.elementInBox.getClass().getName()+": "+this.elementInBox;
    }

}
