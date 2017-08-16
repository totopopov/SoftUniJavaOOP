import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 10.2.2017 г..
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        char[]test=input.toCharArray();

        System.out.println(input.length());
        System.out.println(test.length);

        if (input.charAt(0) == '+' || input.charAt(0) == '-') {
            for (int i = 1; i < input.length(); i++) {
                System.out.println(input.charAt(i));




            }
        }
    }
}
