import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class UnicodeChars {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(reader.readLine());

        for (int i = 0; i < sb.length(); i++) {


            System.out.print(String.format("\\u00%s",Integer.toHexString (sb.charAt(i))));
        }


    }

}
