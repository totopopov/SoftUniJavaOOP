package Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 17:34.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command;

        List<Animal> animals=new ArrayList<>();

        while (!"Beast!".equals(command=reader.readLine())) {
            if (command == null || command.isEmpty()) {
                throw new CustomException();
            }
            try {

                switch (command) {
                    case "Cat":
                        try {
                            String[] tokens = getInput(reader);

                            Animal cat = new Cat(tokens[0],tokens[1],tokens[2]);
                            animals.add(cat);
                        } catch (IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }

                        break;
                    case "Dog":
                        try {
                            String[] tokens = getInput(reader);

                            Animal dog = new Dog(tokens[0],tokens[1],tokens[2]);
                            animals.add(dog);
                        } catch (IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }
                        break;
                    case "Frog":
                        try {
                            String[] tokens = getInput(reader);

                            Animal frog = new Frog(tokens[0],tokens[1],tokens[2]);
                            animals.add(frog);
                        } catch (IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }
                        break;
                    case "Kitten":
                        try {
                            String[] tokens = getInput(reader);

                            Animal kitten = new Kitten(tokens[0],tokens[1],tokens[2]);
                            animals.add(kitten);
                        } catch (IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }
                        break;
                    case "Tomcat":
                        try {
                            String[] tokens = getInput(reader);

                            Animal tomcat = new Tomcat(tokens[0],tokens[1],tokens[2]);
                            animals.add(tomcat);
                        } catch (IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }
                        break;
                    default:
                        reader.readLine();
                        throw new CustomException();

                }
            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.produceSound();
        }



    }

    private static String[] getInput(BufferedReader reader) throws IOException {
        String[] tokens=reader.readLine().split("\\s+");
        if (tokens.length!=3){
            throw new CustomException();
        }
        return tokens;
    }
}
