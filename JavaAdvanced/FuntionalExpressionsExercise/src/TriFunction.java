import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 18.2.2017 г..
 */
public class TriFunction {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int number= Integer.parseInt(reader.readLine());

        String[] nameSet=Arrays.stream(reader.readLine().split(" ")).toArray(String[]::new);

        for (String s : nameSet) {
            int sum=0;
            for (int i = 0; i < s.length(); i++) {
                sum+=(int)s.charAt(i);
            }
            if (sum >=number){
                System.out.println(s);
                break;
            }
        }

    }

}
