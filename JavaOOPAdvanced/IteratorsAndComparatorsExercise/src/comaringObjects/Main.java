package comaringObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 0:02.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer,Person> data = new HashMap<>();

        String input;
        int counter =0;

        while (!"END".equals(input=reader.readLine())){

            String[] tokens=input.split(" ");
            String name=tokens[0];
            int age=Integer.parseInt(tokens[1]);
            String town=tokens[2];

            Person person=new Person(name,age,town);

            data.putIfAbsent(counter++,person);
        }

        int personNumber=Integer.parseInt(reader.readLine());

        if (!data.containsKey(personNumber)){
            System.out.println("No matches");
            return;
        }

        Person person=data.get(personNumber);

        int equal=0;

        for (Map.Entry<Integer, Person> entry : data.entrySet()) {
            if (entry.getValue().compareTo(person)==0){
                equal++;
            }
        }

        if (equal>0){
            System.out.println(String.format("%d %d %d",equal,data.size()-equal,data.size()));
        }else {
            System.out.println("No matches");
        }
    }
}
