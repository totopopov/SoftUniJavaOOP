package CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 20:08.
 */
public class CustomListImpl<T extends Comparable<T>> implements CustomList<T>{
    private List<T> list;

    public CustomListImpl() {
        this.list = new ArrayList<T>();
    }

    @Override
    public void add(T element) {
        this.list.add(element);
    }

    @Override
    public T remove(int index) {
        return this.list.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.list.contains(element);
    }

    @Override
    public void swap(int fromIndex, int toIndex) {
        T elementTo=this.list.get(fromIndex);
        this.list.set(fromIndex,this.list.get(toIndex));
        this.list.set(toIndex,elementTo);
    }

    @Override
    public int countGreaterThat(T element) {
        return (int)this.list.stream().filter(e->e.compareTo(element)>0).count();
    }

    @Override
    public T getMax() {
        return Collections.max(this.list);
    }

    @Override
    public T getMin() {
        return Collections.min(this.list);
    }

    @Override
    public void sort() {
        Collections.sort(this.list,(p1,p2)->p1.compareTo(p2));
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (T t : this.list) {
            sb.append(t).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }


    @Override
    public Iterator<T> iterator() {
        return this.list.iterator();
    }
}
