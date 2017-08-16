import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * Created by Lenovo on 10.2.2017 г..
 */
public class AverageDoubles {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OptionalDouble average = Arrays.stream(reader.readLine().split(" "))
                .filter(c->!c.isEmpty()).mapToDouble(d -> Double.parseDouble(d)).average();

        if (average.isPresent()){
            System.out.printf("%.2f",average.getAsDouble());
        } else {
            System.out.println("No match");
        }

    }


}
