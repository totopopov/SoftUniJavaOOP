import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Lenovo on 25.1.2017 г..
 */
public class Phonebook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> data = new HashMap<>();

        String[] input = sc.nextLine().split("-");

        while (!("search").equals(input[0])){

            data.put(input[0],input[1]);

            input=sc.nextLine().split("-");
        }

        String lineIn="";

        while (!("stop").equals(lineIn=sc.nextLine())){

            if (data.containsKey(lineIn)){
                System.out.println(lineIn+" -> "+data.get(lineIn));
            } else {
                System.out.println("Contact "+ lineIn+ " does not exist.");
            }
        }

    }

}
