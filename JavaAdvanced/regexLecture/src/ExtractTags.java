import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class ExtractTags {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("<.+?>");

        String line;

        while (!"END".equals(line=reader.readLine())) {
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}
