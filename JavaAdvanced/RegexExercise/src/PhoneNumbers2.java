import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 6.2.2017 г..
 */
public class PhoneNumbers2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex = "([A-Z][A-Za-z]*)[^A-Za-z\\+]*?(\\+?\\d[\\/\\.\\-\\(\\)\\d ]*\\d)";

        Pattern pat = Pattern.compile(regex);

        String lineIn;

        StringBuilder sb= new StringBuilder();

        while (!"END".equals(lineIn=reader.readLine())){
            sb.append(lineIn).append(" ");
        }


        Matcher matcher = pat.matcher(sb);

        if (matcher.find()){
            System.out.print("<ol>");

             matcher = pat.matcher(sb);

            while (matcher.find()){

                String number="";
                String textToPat= matcher.group(2);
                Pattern pater=Pattern.compile("[\\d\\+]");
                Matcher mat = pater.matcher(textToPat);
                while (mat.find()){
                  number=number.concat(mat.group());
                }

//                String[] helper = matcher.group(2).split("[\\/\\.\\-\\(\\) ]");
//                for (String s : helper) {
//                    number += s.trim();
//                }

                System.out.print(String.format("<li><b>%s:</b> %s</li>",matcher.group(1),number));

            }
            System.out.print("</ol>");
        }else {
            System.out.println("<p>No matches!</p>");
        }

    }

}
