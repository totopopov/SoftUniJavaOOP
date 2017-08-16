import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class ExtractQuotes {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex="('|\")(.+?)\\1";

        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(reader.readLine());

        while (matcher.find()){
            System.out.println(matcher.group(2));
        }



    }

}
