import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 15:06.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {

        Class<Reflection> reflectionClass = Reflection.class;

        Reflection reflection = reflectionClass.newInstance();

        Field[] fields = reflectionClass.getDeclaredFields();

        Arrays.stream(fields).sorted(Comparator.comparing(Field::getName))
                .filter(field->!Modifier.isPrivate(field.getModifiers()))
                .forEach(field -> System.out.println(String.format("%s must be private!",field.getName())));

        Method[] declaredMethods = reflectionClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).sorted(Comparator.comparing(Method::getName))
                .filter(method -> method.getName().startsWith("get"))
                .filter(method -> method.getParameterCount()==0)
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .forEach(method -> System.out.println(String.format("%s have to be public!",method.getName())));

        Arrays.stream(declaredMethods).sorted(Comparator.comparing(Method::getName))
                .filter(method -> method.getName().startsWith("set"))
                .filter(method -> method.getParameterCount()==1)
                .filter(method -> !Modifier.isPrivate(method.getModifiers()))
                .forEach(method -> System.out.println(String.format("%s have to be private!",method.getName())));


    }
}

