import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class MultiplyNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String in1 = reader.readLine();
        String in2 = reader.readLine();
        StringBuilder sb = new StringBuilder();

        while (in1.charAt(0) == '0') {
            in1 = in1.substring(1);
        }


        char[] num1 = in1.toCharArray();
        int mult = Integer.parseInt(in2);
        int mind = 0;

        for (int i = 0; i < num1.length; i++) {

            mind = mind + (num1[num1.length - 1 - i] - 48) * mult;
            sb.append(mind % 10);
            mind = mind / 10;

        }

        if (mind != 0) {
            sb.append(mind);
        }


        boolean zero = false;

        while (sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
            if (sb.length() == 1) {
                zero = true;
                break;
            }
        }

        if (zero) {
            System.out.println(0);
        } else {
            System.out.println(sb.reverse());
        }


    }

}
