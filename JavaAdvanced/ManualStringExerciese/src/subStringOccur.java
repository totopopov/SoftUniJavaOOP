import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class subStringOccur {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(reader.readLine().toLowerCase());

        String check = reader.readLine().toLowerCase();

        int start;

        int counter = 0;

        if (sb.length() > 0) {


            do {
                start = sb.indexOf(check);
                if (start != -1) {
                    sb.replace(start, start + 1, "");
                    counter++;
                }

            } while (start != -1);

        }
        System.out.println(counter);

    }


}
