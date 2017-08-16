import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class SumAllValues {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regexKey = "^([A-Za-z_]+)\\d(.+)?\\d([A-Za-z_]+)";

        Pattern pat = Pattern.compile(regexKey);

        String key = reader.readLine();

        Matcher match = pat.matcher(key);

        if (match.find()) {

            String input = reader.readLine();

            key = Pattern.quote(match.group(1)) + "(\\-?[\\d\\.]+)" + Pattern.quote(match.group(3));

            pat = Pattern.compile(key);

            match = pat.matcher(input);

            Double sum = 0.0;

            while (match.find()) {

                sum += Double.parseDouble(match.group(1));

            }

            if (sum == 0.0) {
                System.out.println("<p>The total value is: <em>nothing</em></p>");
            } else {

                if (Math.round(sum) == sum) {
                    long out =sum.longValue();
                    System.out.println(String.format("<p>The total value is: <em>%s</em></p>",out));
                } else {
                    System.out.println(String.format("<p>The total value is: <em>%.2f</em></p>", sum));
                }

            }


        } else {
            System.out.println("<p>A key is missing</p>");
        }

    }
}
