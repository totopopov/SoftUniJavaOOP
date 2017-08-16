import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lenovo on 18.1.2017 г..
 */
public class GroupNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input =sc.nextLine().split(", ");

        ArrayList<ArrayList<String>> data = new ArrayList<>();

        data.add(new ArrayList<>());
        data.add(new ArrayList<>());
        data.add(new ArrayList<>());

        for (String s : input) {
            data.get(Math.abs(Integer.parseInt(s)%3)).add(s);
        }

        for (ArrayList<String> datum : data) {
            for (String s : datum) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }

}
