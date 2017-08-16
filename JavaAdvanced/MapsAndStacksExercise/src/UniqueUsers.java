import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by Lenovo on 25.1.2017 г..
 */
public class UniqueUsers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> data = new LinkedHashSet<>();

        int lines = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < lines; i++) {

            data.add(sc.nextLine());
        }


        for (String datum : data) {
            System.out.println(datum);
        }

    }

}
