package MultipleImplementation;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 18:50.
 */
public class Main {public static void main(String[] args) {
    Class[] citizenInterfaces = MultipleImplementation.Citizen.class.getInterfaces();
    if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
            && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
        Method[] methods = Birthable.class.getDeclaredMethods();
        System.out.println(methods.length);
        System.out.println(methods[0].getReturnType().getSimpleName());
        methods = Identifiable.class.getDeclaredMethods();
        System.out.println(methods.length);
        System.out.println(methods[0].getReturnType().getSimpleName());
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String id = scanner.nextLine();
        String birthdate = scanner.nextLine();
        Identifiable identifiable = new MultipleImplementation.Citizen(name,age,id,birthdate);
        Birthable birthable = new MultipleImplementation.Citizen(name,age,id,birthdate);
    }
}


}
