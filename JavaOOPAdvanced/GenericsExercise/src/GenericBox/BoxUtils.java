package GenericBox;


import java.util.Comparator;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 18.3.2017 г. at 4:17.
 */
public class BoxUtils {

    public static <T extends Comparable<T>> void swapElements(int elementOne, int elementTwo, List<Box<T>> data){
        Box<T> forTwo=data.get(elementOne);
        data.set(elementOne,data.get(elementTwo));
        data.set(elementTwo,forTwo);
    }




    public static <T extends Comparable<T>> int genericCount(Box<T> element, List<Box<T>> data){
        return (int)data.stream().filter(e->e.getElementInBox().compareTo(element.getElementInBox())>0).count();
    }



}
