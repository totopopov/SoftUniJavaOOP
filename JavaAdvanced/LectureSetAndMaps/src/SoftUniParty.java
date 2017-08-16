import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<String> participants =new TreeSet<>();

        String input="";

        while(!("PARTY").equals(input=sc.nextLine())){

            participants.add(input);
        }

        while(!("END").equals(input=sc.nextLine())){

            participants.remove(input);
        }

        System.out.println(participants.size());

        for (String participant : participants) {
            System.out.println(participant);
        }
    }
}
