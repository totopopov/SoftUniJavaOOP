import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class CustomerComparator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] data = Arrays.stream(reader.readLine().split(" ")).map(e -> Integer.parseInt(e)).
                toArray(Integer[]::new);

        //List<Integer> inut = Arrays.stream(reader.readLine().split(" ")).map(e->Integer.parseInt(e)).collect(Collectors.toList());

        Comparator<Integer> check = (e1, e2) -> {
            if (e1 == e2) {
                return 0;
            } else {
                if (e1 % 2 != 0 && e2 % 2 != 0) {
                    return e1 > e2 ? 1 : -1;
                } else if (e1 % 2 == 0 && e2 % 2 == 0) {
                    return e1 > e2 ? 1 : -1;
                } else if (e1 % 2 != 0 && e2 % 2 == 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Arrays.sort(data, check);

        for (Integer integer : data) {
            System.out.print(integer + " ");
        }
    }

}
