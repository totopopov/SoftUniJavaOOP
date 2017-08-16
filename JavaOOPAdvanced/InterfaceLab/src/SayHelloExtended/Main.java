package SayHelloExtended;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 20:05.
 */
public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));

        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        person.sayHello();
    }

}

