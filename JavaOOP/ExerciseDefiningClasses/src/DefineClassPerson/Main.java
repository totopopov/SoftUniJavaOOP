package DefineClassPerson;


import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
    }

}
