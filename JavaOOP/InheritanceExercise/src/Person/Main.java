package Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 20:05.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name=reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        try {
            Child child=new Child(name,age);
            System.out.println(child.toString());
            String personClassName = Person.class.getSimpleName();
            String childClassName = Child.class.getSimpleName();
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
