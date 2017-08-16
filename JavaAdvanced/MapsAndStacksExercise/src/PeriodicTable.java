import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Lenovo on 25.1.2017 г..
 */
public class PeriodicTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<String> data = new TreeSet<>();

        int lines = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < lines; i++) {

            String[] lineData= sc.nextLine().split(" ");

            for (String s : lineData) {
                data.add(s);
            }
        }

        for (String s : data) {
            System.out.print(s+" ");
        }




    }

}
