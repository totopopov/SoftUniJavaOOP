package FirstAndReserveTeam;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 23.2.2017 г. at 16:59.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            persons.add(new Person(input[0], input[1], Integer.parseInt(input[2]),Double.parseDouble(input[3])));
        }

        Team team = new Team("MInior");
        for (Person person : persons) {
            team.addPlayer(person);
        }

        System.out.println("First team have "+team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have "+team.getReserveTeam().size() + " players");

    }
}
