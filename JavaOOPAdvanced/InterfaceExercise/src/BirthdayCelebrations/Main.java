package BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 20:18.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Birthable> dataMap = new ArrayList<>();

        String input;

        while (!"End".equals(input = reader.readLine())) {

            String[] tokens = input.split("\\s+");

            String type = tokens[0];
            String name = tokens[1];

            switch (type) {
                case "Citizen":
                    Birthable citizen = new Citizen(name, Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                    dataMap.add(citizen);
                    break;
                case "Pet":
                    Birthable pet = new Pet(name, tokens[2]);
                    dataMap.add(pet);
                    break;
                default:
                    break;
            }

        }

        String year =String.valueOf(Integer.parseInt(reader.readLine()));


        dataMap.stream().
                filter(b -> b.isBornInYear(year)).
                forEach(b -> System.out.println(b.getBirthday()));

    }
}
