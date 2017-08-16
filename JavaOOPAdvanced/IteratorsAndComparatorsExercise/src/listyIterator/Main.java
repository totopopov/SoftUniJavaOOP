package listyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 18:30.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        LystIterator<String> iterator= new ListyIteratorImpl<>();

        while (!"END".equals(input=reader.readLine())){

            String[] tokens=input.split(" ");



            switch (tokens[0]){
                case "Create":
                    String [] strings = Arrays.stream(tokens).skip(1).toArray(String[]::new);
                    iterator=new ListyIteratorImpl<>(strings);
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "Move":
                    System.out.println(iterator.Move());
                    break;
                case "Print":
                    try {
                        System.out.println(iterator.Print());
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "PrintAll":
                    try {
                        System.out.println(iterator.PrintAll());
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
            }

        }

        iterator.forEach(s-> System.out.println(s));
    }
}
