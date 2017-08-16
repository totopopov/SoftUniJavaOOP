import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class SumBigNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        char[] num1 = reader.readLine().toCharArray();
        char[] num2 = reader.readLine().toCharArray();

        int size1 = num1.length;
        int size2 = num2.length;

        StringBuilder sb = new StringBuilder();
        int mind = 0;


        for (int i = 0; i < Math.min(size1, size2); i++) {

            int number1 = num1[size1 - i - 1] - 48;
            int number2 = num2[size2 - i - 1] - 48;

            mind += number1 + number2;


            sb.append(mind % 10);
            mind = mind / 10;

        }


        for (int i = 0; i < Math.max(size1, size2) - Math.min(size1, size2); i++) {

            int number = (size1 > size2) ? num1[size1 - size2 - 1 - i] - 48 : num2[size2 - size1 - 1 - i] - 48;

            mind += number;
            sb.append(mind % 10);
            mind = mind / 10;

        }

        if (mind != 0) {
            sb.append(mind);
        }




        System.out.println(sb.reverse());
    }

}
