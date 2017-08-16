package CustomList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 20:59.
 */
public class Sorter {

    public static <T extends Comparable<T>> void sort(CustomList<T> data){
        data.sort();
    }

}
