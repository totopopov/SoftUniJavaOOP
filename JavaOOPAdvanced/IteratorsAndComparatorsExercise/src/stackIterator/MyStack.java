package stackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 20:52.
 */
public class MyStack<T> implements CustomStack<T> {
    private List<T> data;


    public MyStack() {
        this.data = new ArrayList<>();
    }

    @Override
    public void push(T element) {
        this.data.add(element);
    }

    @Override
    public T pop() {
        if (!this.iterator().hasNext()){
            throw new NullPointerException("No elements");
        }
        T element =this.iterator().next();
        this.data.remove(this.data.size()-1);
        return element;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
       Iterator<T> iterator= this.iterator();
       while (iterator.hasNext()){
           action.accept(iterator.next());
       }
    }

    @Override
    public Iterator<T> iterator() {
     return new ThisIterator();
    }

    private final class ThisIterator implements Iterator<T>{
        private int index;

        public ThisIterator() {
            this.index = data.size();
        }

        @Override
        public boolean hasNext() {
            return this.index>0;
        }

        @Override
        public T next() {
            return data.get(--this.index);
        }
    }

}
