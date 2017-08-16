import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class AppliedArithmetics {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] data = Arrays.stream(reader.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();

        String line;

        BiFunction<String, Integer, Integer> doMagic = (x, y) -> {
            switch (x) {
                case "add":
                    return y + 1;
                case "multiply":
                    return y * 2;
                case "subtract":
                    return y - 1;
                default:
                    return y;
            }
        };

        Consumer<int[]> printAll= e->{
            for (int i : e) {
                System.out.print(i + " ");
            }
            System.out.println();
        };



        while (!"end".equals(line = reader.readLine())) {

            if (!"print".equals(line)){
                for (int i = 0; i < data.length; i++) {
                    data[i]=doMagic.apply(line,data[i]);
                }
            } else {
                printAll.accept(data);
            }
        }

    }



}
