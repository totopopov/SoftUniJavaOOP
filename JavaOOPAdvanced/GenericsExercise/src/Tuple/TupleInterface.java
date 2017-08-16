package Tuple;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 21:23.
 */
public interface TupleInterface<T extends Comparable<T>,P extends Comparable<P>> {

   T getFirstItem();
   P getSecondItem();
}
