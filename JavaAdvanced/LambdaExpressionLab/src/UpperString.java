import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Lenovo on 9.2.2017 г..
 */
public class UpperString {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(reader.readLine().split(" ")).map(s->s.toUpperCase()).forEach(e-> System.out.print(e+" "));


    }

}
