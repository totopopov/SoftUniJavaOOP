import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * Created by Lenovo on 10.2.2017 г..
 */
public class PrintEvanNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        OptionalDouble min = Arrays.stream(reader.readLine().split(" "))
                .filter(d->!d.isEmpty()).mapToDouble(Double::parseDouble).filter(d -> d % 2 == 0).min();

        if (min.isPresent()){
            System.out.printf("%.2f",min.getAsDouble());
        } else {
            System.out.println("No match");
        }

    }
}
