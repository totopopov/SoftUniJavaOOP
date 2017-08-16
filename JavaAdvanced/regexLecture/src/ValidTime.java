import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class ValidTime {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex = "^((0[1-9])|(1[012])):([0-5]\\d):([0-5]\\d) [AP]M$";

        String line;

        while (!"END".equals(line=reader.readLine())){
            System.out.println(Pattern.matches(regex,line)?"valid":"invalid");
        }

    }

}
