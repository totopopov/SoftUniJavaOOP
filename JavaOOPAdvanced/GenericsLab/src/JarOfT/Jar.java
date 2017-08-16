package JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 20:43.
 */
public class Jar<T> implements JarInt<T> {
    private Deque<T> data;

    public Jar() {
        this.data=new ArrayDeque<T>();
    }

    @Override
    public void add(T element) {
        this.data.push(element);
    }

    @Override
    public T remove() {
     return this.data.pop();
    }
}
