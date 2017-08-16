package FamilyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 0:48.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Person> people =new LinkedHashMap<>();
        ArrayDeque<String> inputs=new ArrayDeque<>();
        HashMap<String, Person> parents =new LinkedHashMap<>();
        HashMap<String, Person> children =new LinkedHashMap<>();
        Person theGuyWithTheTree=null;
        String input;
        String theOne=reader.readLine();

        while (!"End".equals(input=reader.readLine())){

            if (!input.contains("-")){
              String[] personArg= input.split(" ");

              String name=personArg[0]+" "+personArg[1];
              String birthday=personArg[2];

              Person person=new Person(name,birthday);

              people.putIfAbsent(person.getName(),person);

            }else {
                inputs.offer(input);
            }
        }

        theGuyWithTheTree = findPerson(people, theGuyWithTheTree, theOne);

        while (!inputs.isEmpty()){
           String[] conncections= inputs.poll().split(" - ");

           if (conncections[0].equals(theGuyWithTheTree.getBirthday())||conncections[0].equals(theGuyWithTheTree.getName())){

               Person child=findPerson(people, theGuyWithTheTree, conncections[1]);
               children.putIfAbsent(child.toString(),child);
           }

            if (conncections[1].equals(theGuyWithTheTree.getBirthday())||conncections[1].equals(theGuyWithTheTree.getName())){

                Person parent=findPerson(people, theGuyWithTheTree, conncections[0]);
                parents.putIfAbsent(parent.toString(),parent);
            }
        }

        System.out.println(theGuyWithTheTree.getName() + " " + theGuyWithTheTree.getBirthday());

        System.out.println("Parents:");
        for (Map.Entry<String, Person> entry : parents.entrySet()) {
            System.out.println(entry.getValue().getName() + " " + entry.getValue().getBirthday());
        }
        System.out.println("Children:");
        for (Map.Entry<String, Person> entry : children.entrySet()) {
            System.out.println(entry.getValue().getName() + " " + entry.getValue().getBirthday());
        }
    }

    private static Person findPerson(HashMap<String, Person> people, Person theGuyWithTheTree, String theOne) {
        for (Person person : people.values()) {
            if (person.getName().equals(theOne)||person.getBirthday().equals(theOne)){
                theGuyWithTheTree=person;
            }
        }
        return theGuyWithTheTree;
    }
}
