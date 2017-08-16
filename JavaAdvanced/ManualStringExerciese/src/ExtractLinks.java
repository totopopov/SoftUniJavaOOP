import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class ExtractLinks {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String pattern1 = "<a.*?>";

        Pattern pattern = Pattern.compile(pattern1);

        StringBuilder sb = new StringBuilder();

        String line;

        while (!"END".equals(line = reader.readLine())) {
            sb.append(line);
        }

        Matcher matcher = pattern.matcher(sb);

        while (matcher.find()) {

            String patern3 = "href\\s*?=\\s*(((\"+)|('*))(.+?)\\2(\\s|>))";

            Pattern patternLink = Pattern.compile(patern3);

            Matcher matcher1 = patternLink.matcher(matcher.group());

            while (matcher1.find()) {
                System.out.println(matcher1.group(5));
            }
        }

    }


}
