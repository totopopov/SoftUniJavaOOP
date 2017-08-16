package codingTracker;

import java.lang.reflect.Method;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 17:34.
 */
public class Tracker {

    @Author(name = "Todor")
    public static void printMethodsByAuthor(Class<?> cl){

        Method[] methods = cl.getDeclaredMethods();
        for (Method method : methods) {

            Author annotation = method.getAnnotation(Author.class);
            System.out.println(method.getName()+" "+  annotation.name());

        }

    }

    @Author(name = "Todor")
    public static void main(String[] args) {
            Tracker.printMethodsByAuthor(Tracker.class);
    }
}
