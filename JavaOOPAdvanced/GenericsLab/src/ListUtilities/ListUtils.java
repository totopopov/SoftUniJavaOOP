package ListUtilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 18.3.2017 г. at 2:26.
 */
public class ListUtils {
    private static final int MAX_ELEMENT_COMPARE_REZULT=1;
    private static final int MIN_ELEMENT_COMPARE_REZULT=-1;


    public static <T extends Comparable<T>> T getMin(List<T> list){
       return findMinOrMax(list,MIN_ELEMENT_COMPARE_REZULT);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        return findMinOrMax(list,MAX_ELEMENT_COMPARE_REZULT);
    }

    private static <T extends Comparable<T>> T findMinOrMax(List<T> list,int minOrMax){

        if (!list.isEmpty()){
            T returningElemet= list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).compareTo(returningElemet)==minOrMax){
                    returningElemet=list.get(i);
                }
            }
            return returningElemet;
        }
        throw new IllegalArgumentException("List is empty");
    }

    public static Iterable<Integer> getNullIndices(List<?> list){
        Collection<Integer> nullIndices= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==null){
                nullIndices.add(i);
            }
        }
        return nullIndices;
    }

    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source){
        for (List<? extends T> list : source) {
            destination.addAll(list);
        }
    }

    public static <T> void addAll(List<? super T> destination, List<? extends T> source){
            destination.addAll(source);
    }

}
