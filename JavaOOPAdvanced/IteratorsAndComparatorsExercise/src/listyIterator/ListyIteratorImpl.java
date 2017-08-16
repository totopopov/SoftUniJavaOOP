package listyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 18:32.
 */
public class ListyIteratorImpl<T> implements Iterable<T>,LystIterator<T> {
    private T[] elements;
    private int index;


    public ListyIteratorImpl(T... elements) {
        this.setElements(elements);
        this.setIndex(0);
    }

    private void setElements(T[] elements) {
        this.elements = elements;
    }

    private void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean Move(){
        if (this.hasNext()){
            this.iterator().next();
            return true;
        }
        return false;
    }
    @Override
    public boolean hasNext(){
        return this.index<this.elements.length;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        while (this.iterator().hasNext()){
            action.accept(this.iterator().next());
        }
    }
    @Override
    public T Print(){
        if (this.elements.length==0 || index==this.elements.length){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        return this.elements[index];
    }
    @Override
    public String PrintAll(){
        if (this.elements.length==0 || index==this.elements.length){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        return String.join(" ", Arrays.stream(this.elements).map(e->e.toString()).collect(Collectors.toList()));
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private final class CustomIterator implements Iterator<T>{

        @Override
        public boolean hasNext() {
             return index<elements.length;
        }

        @Override
        public T next() {
            return elements[index++];
        }
    }
}
