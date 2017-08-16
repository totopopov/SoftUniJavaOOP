package GenericBox;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 19:42.
 */
public interface BoxInterface<T extends Comparable<T>> {
    T getElementInBox();
}
