import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Lenovo on 10.2.2017 г..
 */
public class BoundedNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] boindries= Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).filter(n-> boindries[0]<= n && n <= boindries[1])
                .forEach(e-> System.out.printf("%s ",e));



    }

}
