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
public class problem6 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        String regex ="(,|_)([a-zA-Z]+)(\\d+)";

        Pattern pat = Pattern.compile(regex);
        LinkedHashMap<String,String> memory=new LinkedHashMap<>();

        while (!"Ascend".equals(input=reader.readLine())){


            for (Map.Entry<String, String> entry : memory.entrySet()) {
                if (input.contains(entry.getKey())){
                    input.replaceFirst(entry.getKey(),entry.getValue());
                }
            }


            Matcher matcher=pat.matcher(input);

            while (matcher.find()){








            }




        }



    }

}
