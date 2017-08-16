import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class TextFilter {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words =reader.readLine().split(", ");

        StringBuilder sb =new StringBuilder(reader.readLine());

        for (String word : words) {
            int index;
            while ((index=sb.indexOf(word))!=-1){
                sb.replace(index,index+word.length(),word.replaceAll("\\w","*"));
            }
        }

        System.out.println(sb);

    }

}
