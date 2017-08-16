import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 19.2.2017 г..
 */
public class Problem3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        String regex = "(,|_)([a-zA-Z]+)(\\d)";

        StringBuilder sb = new StringBuilder();

        Pattern pat = Pattern.compile(regex);
        LinkedHashMap<String, String> memory = new LinkedHashMap<>();

        while (!"Ascend".equals(input = reader.readLine())) {
            for (Map.Entry<String, String> entry : memory.entrySet()) {
                while (input.indexOf(entry.getKey()) != -1) {
                    input = input.replaceFirst(entry.getKey(), entry.getValue());
                }
            }
            Matcher matcher = pat.matcher(input);

            while (matcher.find()) {

                String bingo = matcher.group(2);
                char[] matched = bingo.toCharArray();
                int digit = Integer.parseInt(matcher.group(3));
                for (int i = 0; i < matched.length; i++) {
                    matched[i] = matcher.group(1).equals(",") ? (char) (matched[i] + digit) :
                            (char) (matched[i] - digit);
                }
                input = input.replaceFirst(matcher.group(), String.valueOf(matched));
                memory.put(matcher.group(), String.valueOf(matched));
            }
            System.out.println(input);
        }
    }

}
