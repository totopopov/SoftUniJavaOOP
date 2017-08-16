package stackIterator;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 20:38.
 */
public interface CustomStack<T> extends Iterable<T> {

    void push(T element);

    T pop();

}
