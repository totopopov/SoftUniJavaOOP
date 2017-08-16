import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 31.1.2017 г..
 */
public class ParseTags {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        String begin="<upcase>";

        String end="</upcase>";

        StringBuilder sb = new StringBuilder();

        sb.append(reader.readLine());



        while (!(sb.indexOf(begin)==-1)){
            int first = sb.indexOf(begin);
            int last =sb.indexOf(end);

            sb.replace(first,last + end.length(), sb.substring(first+begin.length(),last).toUpperCase());
        }

        System.out.println(sb);

    }

}
