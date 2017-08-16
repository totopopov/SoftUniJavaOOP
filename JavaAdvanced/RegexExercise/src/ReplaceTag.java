import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class ReplaceTag {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String pattern = "<a href=(.+?)>(\\s*.+?)<\\/a>";

        Pattern pat = Pattern.compile(pattern);

        String line;

        StringBuilder sb = new StringBuilder();

        while (!"END".equals(line = reader.readLine())) {

            sb.append(line).append("\r\n");

        }
        Matcher matcher = pat.matcher(sb.toString().trim());

        while (matcher.find()) {

            String match = matcher.group();

            int index = sb.indexOf(match);

            String replacement = "[URL href=" + matcher.group(1) + "]" + matcher.group(2) + "[/URL]";

            sb = sb.replace(index, index + matcher.group().length(), replacement);

            matcher = pat.matcher(sb.toString().trim());

        }
        System.out.println(sb);

    }

}
