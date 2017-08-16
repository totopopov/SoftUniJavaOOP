package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 0:53.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Set<Person> dataByName = new TreeSet<>();
        Set<Person> dataByAge = new HashSet<>();
        int lines =Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {
            String[] tokens=reader.readLine().split(" ");
            Person person=new Person(tokens[0],Integer.parseInt(tokens[1]));

            dataByName.add(person);
            dataByAge.add(person);
        }

        System.out.println(dataByName.size());
        System.out.println(dataByAge.size());
    }
}
