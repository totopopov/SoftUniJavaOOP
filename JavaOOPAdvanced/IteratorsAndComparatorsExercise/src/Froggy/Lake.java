package Froggy;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 0:00.
 */
public class Lake implements Iterable<Integer> {
    private List<Integer> dataset;


    public Lake(int... jumps) {
        this.setDataset(jumps);
    }

    private void setDataset(int... jumps) {
        this.dataset=new ArrayList<>();
        int evenIndex=0;
        int currentIndex=0;
        for (int jump : jumps) {
            if (currentIndex%2==0){
                dataset.add(evenIndex++,jump);
            } else {
                dataset.add(jump);
            }
            currentIndex++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterator<Integer> iterator=new Frog();
        while (iterator.hasNext()){
            action.accept(iterator.next());
        }
    }

    @Override
    public String toString() {
        return dataset.stream().map(Object::toString).collect(Collectors.joining(", "));
    }

    private final class Frog implements Iterator<Integer>{
        private int index;
        public Frog() {
            this.index=0;
        }

        @Override
        public boolean hasNext() {
            return index<dataset.size();
        }

        @Override
        public Integer next() {
            return dataset.get(index++);
        }
    }

}
