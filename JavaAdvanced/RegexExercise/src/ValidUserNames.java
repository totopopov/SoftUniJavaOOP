import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class ValidUserNames {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("[\\(\\)\\/\\\\ ]+");

        ArrayList<String> data = new ArrayList<>();

        String regex = "[A-Za-z][\\w]{2,24}";

        long sumLenght = Long.MIN_VALUE;

        String max1 = "";
        String max2 = "";

        for (String s : input) {
            if (s.replaceAll(regex, "").equals("") && s.length()>2 && s.length()<26) {
                data.add(s);
            }
        }

        for (int i = 0; i < data.size() - 1; i++) {

            String elemnt1 = data.get(i);
            String elemnt2 = data.get(i + 1);


            if (elemnt1.length() + elemnt2.length() > sumLenght) {

                max1 = elemnt1;
                max2 = elemnt2;
                sumLenght = max1.length() + max2.length();
            }


        }

        System.out.println(max1);
        System.out.println(max2);

    }

}
