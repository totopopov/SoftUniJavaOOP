import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class NonDigit {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("\\D");

        Matcher matcher = pattern.matcher(reader.readLine());

        int count=0;

        while (matcher.find()){
            count++;
        }

        System.out.println("Non-digits: "+count);

    }
}
