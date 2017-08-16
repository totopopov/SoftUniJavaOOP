import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class SeriesOfLetters {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        Pattern pattern = Pattern.compile("([a-zA-z])\\1+");

        Matcher matcher = pattern.matcher(line);

        while (matcher.find()){

            line=matcher.replaceAll("$1");
        }
        System.out.println(line);
    }

}
