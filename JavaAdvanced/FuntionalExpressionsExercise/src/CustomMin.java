import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class CustomMin {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] inData= Arrays.stream(reader.readLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        final int[] min = {Integer.MAX_VALUE};
        Function<int[],Integer> minValue= e-> {
            Arrays.stream(e).forEach( k->{
            if (k< min[0]){
                min[0] =k;
            }

        }); return min[0];};

        System.out.println(minValue.apply(inData));

    }


}
