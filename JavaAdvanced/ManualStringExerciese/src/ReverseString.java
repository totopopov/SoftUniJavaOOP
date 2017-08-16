import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class ReverseString {


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        sb.append(reader.readLine());
        sb.reverse();

        System.out.println(sb);

    }


}
