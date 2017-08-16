import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class PrediateForNames {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        String[] names = reader.readLine().split(" ");

        Predicate<String> check = e-> e.length()<=number;

        for (String name : names) {
            if (check.test(name)){
                System.out.println(name);
            }
        }


    }

}
