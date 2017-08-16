import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class ValidUserNames {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex="^([\\w-]{3,16})$";
        String line;
        while (!"END".equals(line = reader.readLine())) {

            System.out.println(Pattern.matches(regex,line)?"valid":"invalid");

        }

    }

}
