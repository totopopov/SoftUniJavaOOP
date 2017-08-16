import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 6.2.2017 г..
 */
public class ExtracLinksNoRegex {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder();

        String line;

        while (!"END".equals(line=reader.readLine())){
            input.append(line);
        }






    }

}
