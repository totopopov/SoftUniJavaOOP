package ValidationData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 24.2.2017 г. at 18:25.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> persons = new ArrayList<>();

        boolean exception = false;

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            try {
                Person person = new Person(input[0], input[1], Integer.parseInt(input[2]),Double.parseDouble(input[3]));
                persons.add(person);
            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
                exception=true;
            }
        }

        if (persons.size()>0 && exception){
            System.out.println("--------------------");
        }

        int bonus = Integer.parseInt(reader.readLine());

        for (Person person : persons) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }

    }

}
