import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class MatchNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex="^^\\+359( |-)2\\1\\d{3}\\1\\d{4}$";

        String line;

        while (!"end".equals(line=reader.readLine())){
            if (Pattern.matches(regex,line)){
                System.out.println(line);
            }
        }


    }

}
