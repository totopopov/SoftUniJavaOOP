package Froggy;

import java.util.Iterator;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 23:59.
 */
public class Frog<T> implements Iterator<T> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
