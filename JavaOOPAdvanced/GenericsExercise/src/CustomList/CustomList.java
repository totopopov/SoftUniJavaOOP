package CustomList;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 20:06.
 */
public interface CustomList<T extends Comparable<T>> extends Iterable<T>{

    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int fromIndex, int toIndex);

    int countGreaterThat(T element);

    T getMax();

    T getMin();

    void sort();

}
