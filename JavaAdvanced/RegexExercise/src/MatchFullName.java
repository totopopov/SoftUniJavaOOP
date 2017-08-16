import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class MatchFullName {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String line;

        String regex="^[A-Z][a-z]+? [A-Z][a-z]+$";

        while (!"end".equals(line=reader.readLine())){

//            Pattern pattern=Pattern.compile(regex);
//
//            Matcher matcher=pattern.matcher(line);
//
//            if (matcher.find()){
//                System.out.println(line);
//            }


            if (Pattern.matches(regex,line)){
                System.out.println(line);
            }

        }



    }
}
