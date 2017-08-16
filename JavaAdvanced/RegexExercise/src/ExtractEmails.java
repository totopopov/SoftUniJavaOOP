import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class ExtractEmails {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex ="\\b[a-z0-9]+[a-z0-9\\._\\-]*[a-z0-9]@([a-z0-9]+)([a-z0-9\\.\\-]*)\\.{1}[a-z0-9]+\\b";

        String input;

        while (!"end".equals(input=reader.readLine())){

            Pattern pattern=Pattern.compile(regex);

            Matcher matcher=pattern.matcher(input);

            while (matcher.find()){
                System.out.println(matcher.group().trim());
            }

        }

    }
}
