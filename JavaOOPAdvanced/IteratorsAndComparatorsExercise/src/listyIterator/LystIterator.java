package listyIterator;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 19:26.
 */
public interface LystIterator<T> extends Iterable<T> {
    boolean Move();

    T Print();

    boolean hasNext();

    String PrintAll();
}
