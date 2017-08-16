import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class StringLength {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        sb.append(reader.readLine());

        if (sb.length() >= 20) {
            sb.replace(20, sb.length(), "");
        } else {
            int size = sb.length();
            for (int i = 0; i < 20 - size; i++) {
                sb.append("*");
            }
        }

        System.out.println(sb);
    }

}
