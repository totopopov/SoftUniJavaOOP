import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class FindSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] data = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(e->Integer.parseInt(e)).toArray();

        Function<int[],Integer> minValue= e-> {
            int min = e[0];
            int index=0;
            for (int i = 0; i < e.length; i++) {
                if (e[i]<=min){
                    min=e[i];
                    index=i;
                }
            }
            return index;
        };

        System.out.println(minValue.apply(data));

    }

}
