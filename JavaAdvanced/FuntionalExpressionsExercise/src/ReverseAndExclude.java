import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class ReverseAndExclude {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] data = Arrays.stream(reader.readLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int number = Integer.parseInt(reader.readLine());

        Predicate<Integer> check= e-> Math.abs(e)%number!=0;

        StringBuilder sb = new StringBuilder();

        for (int i = data.length-1; i >=0 ; i--) {
            if (check.test(data[i])){
                sb.append(data[i]).append(" ");
            }
        }

        System.out.println(sb.toString().trim());


    }

}
