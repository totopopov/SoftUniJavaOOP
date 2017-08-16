import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class KnightsOfHonor {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] inData=reader.readLine().split(" ");

        Consumer<String[]> printAll= x-> Arrays.stream(x).forEach(y-> System.out.println("Sir ".concat(y)));

        printAll.accept(inData);
    }

}
