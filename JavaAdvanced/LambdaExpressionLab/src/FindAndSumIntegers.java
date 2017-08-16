import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Created by Lenovo on 10.2.2017 г..
 */
public class FindAndSumIntegers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        OptionalInt sum = Arrays.stream(reader.readLine().split("\\s+"))
                .filter(e->!e.isEmpty()).filter(e -> {

            if (e.charAt(0) == '+' || e.charAt(0) == '-') {
                for (int i = 1; i < e.length(); i++) {
                    if (!Character.isDigit(e.charAt(i))) {
                        return false;
                    }
                }
            } else {
                for (int i = 0; i < e.length(); i++) {
                    if (!Character.isDigit(e.charAt(i))) {
                        return false;
                    }
                }
            }
            return true;
        }
        ).mapToInt(Integer::parseInt).reduce((x, y) -> x + y);

        if (sum.isPresent()) {
            System.out.println(sum.getAsInt());
        } else {
            System.out.println("No match");
        }


    }

}
