import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 6.2.2017 г..
 */
public class PhoneNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    //    LinkedHashMap<String, String> data = new LinkedHashMap<>();

        StringBuilder input = new StringBuilder();

        String line = "";

        while (!"END".equals(line = reader.readLine())) {

            input.append(line).append(" ");
        }

        String regex = "([A-Z][A-Za-z]*)|(\\+{0,1}\\d[\\d\\(\\)\\. \\/\\-]*\\d)";

        Pattern pat = Pattern.compile(regex);

        Matcher matcher = pat.matcher(input);


        String name = "";
        String number = "";
        boolean nameIs = false;
        boolean numberIs = false;
        boolean first=true;

        while (matcher.find()) {


            if (90 >= matcher.group().charAt(0) && matcher.group().charAt(0) >= 65) {
                name = matcher.group();
                nameIs = true;
            } else {
                String[] helper = matcher.group().split("[\\(\\)\\. \\/\\-]");
                for (String s : helper) {
                    number += s;
                }
                numberIs = true;
            }

            if (numberIs && nameIs) {

                if (first){
                    first=false;
                    System.out.print("<ol>");
                }

                System.out.print(String.format("<li><b>%s:</b> %s</li>",name,number));

                //data.put(name, number);

                number="";
                name="";

                nameIs=false;
                numberIs=false;

            }

        }

        if (!first){
            System.out.print("</ol>");
        }else {
            System.out.println("<p>No matches!</p>");
        }

//        if (!data.isEmpty()){
//            System.out.print("<ol>");
//            for (Map.Entry<String, String> entry : data.entrySet()) {
//                System.out.print(String.format("<li><b>%s:</b> %s</li>",entry.getKey(),entry.getValue()));
//            }
//            System.out.print("</ol>");
//        }else {
//            System.out.println("<p>No matches!</p>");
//        }
    }

}
