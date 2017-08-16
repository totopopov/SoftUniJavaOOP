import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 6.2.2017 г..
 */
public class SentenceExtractor {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = reader.readLine();

        key=" "+key+" ";

        String input = reader.readLine();


        String regex = "[A-Z](.+?)[\\.?!]";

        Pattern pat = Pattern.compile(regex);


        Matcher matcher = pat.matcher(input);

        while (matcher.find()) {

            if (matcher.group().indexOf(key)>0){

                System.out.println(matcher.group());

            }

        }


    }


}
