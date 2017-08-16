import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class EvenOrOdds {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        String oddOrEven=reader.readLine();

        Predicate<Integer> check = e-> "odd".equals(oddOrEven)?Math.abs(e)%2==1:Math.abs(e)%2==0;

        StringBuilder sb = new StringBuilder();

        for (int i = numbers[0]; i <= numbers[1]; i++) {
           if (check.test(i)){
               sb.append(i).append(" ");
           }
        }

        System.out.println(sb.toString().trim());
    }

}
