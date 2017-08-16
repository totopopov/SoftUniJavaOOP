package GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 21:33.
 */
public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int lenght, T element){

        T[] array = (T[])new Object[lenght];

        for (int i = 0; i < lenght; i++) {
            array[i]=element;
        }

        return array;

    }
    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> cl,int lenght, T element){

        T[] array = (T[]) Array.newInstance(cl,lenght);

        for (int i = 0; i < lenght; i++) {
            array[i]=element;
        }
        return array;
    }


}
