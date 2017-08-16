import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.*;

/**
 * Created by Lenovo on 18.2.2017 г..
 */
public class TheBiggestORsmallestInteger {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = Arrays.stream(reader.readLine().split(" ")).mapToInt(c -> Integer.parseInt(c)).toArray();

        String command = reader.readLine();

        IntConsumer print = p -> System.out.println(p);

        switch (command) {
            case "minEven":
                 Arrays.stream(ints).filter(c -> c % 2 == 0).min().ifPresent(print);
            break;
            case "maxEven":
                 Arrays.stream(ints).filter(c -> c % 2 == 0).max().ifPresent(print);
            break;
            case "minOdd":
                 Arrays.stream(ints).filter(c -> c % 2 == 1).min().ifPresent(print);
            break;
            case "maxOdd":
                 Arrays.stream(ints).filter(c -> c % 2 == 1).max().ifPresent(print);
            break;

        }

    }

}
