package Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 0:03.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Me> people = new LinkedHashMap<>();

        String input;
        while (!"End".equals(input = reader.readLine())) {
            String[] argu = input.split(" ");
            String personName = argu[0];

            Me person = new Me(personName);

            people.putIfAbsent(person.getName(), person);

            switch (argu[1].toLowerCase()) {
                case "company":
                    Compnay compnay = new Compnay(argu[2], argu[3], Double.parseDouble(argu[4]));
                    people.get(personName).setCompnay(compnay);
                    break;
                case "car":
                    Car car = new Car(argu[2], Integer.parseInt(argu[3]));
                    people.get(personName).setCar(car);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(argu[2], argu[3]);
                    people.get(personName).addPokemon(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(argu[2], argu[3]);
                    people.get(personName).addParent(parent);
                    break;
                        case "children":
                            Child child=new Child(argu[2], argu[3]);
                            people.get(personName).addChild(child);
                            break;
            }
        }

        String theOne=reader.readLine();

        System.out.println(people.get(theOne).toString());


    }
}
