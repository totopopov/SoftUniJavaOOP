import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by Lenovo on 25.1.2017 г..
 */
public class SetsElements {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        String[] input = sc.nextLine().split(" ");

        for (int i = 0; i <Integer.parseInt(input[0]) ; i++) {
            set1.add(Integer.parseInt(sc.nextLine()));
        }

        for (int i = 0; i <Integer.parseInt(input[1]) ; i++) {
            set2.add(Integer.parseInt(sc.nextLine()));
        }

        for (Integer integer : set1) {
            if (set2.contains(integer)){
                System.out.print(integer + " ");
            }
        }
    }
}
