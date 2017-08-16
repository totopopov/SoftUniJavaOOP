import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

/**
 * Created by Lenovo on 7.2.2017 г..
 */
public class SumNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(", ");

        int sum=0;

        Function<String,Integer> parser = x->Integer.parseInt(x);


        for (String s : input) {
            sum+=parser.apply(s);
        }

        System.out.println("Count = "+input.length);
        System.out.println("Sum = "+sum);


    }

}
