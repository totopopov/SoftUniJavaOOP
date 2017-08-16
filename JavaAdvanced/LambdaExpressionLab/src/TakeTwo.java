import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
/**
 * Created by Lenovo on 9.2.2017 г..
 */
public class TakeTwo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Arrays.stream(reader.readLine().split("\\s+"))
                .map(e->Integer.parseInt(e)).distinct()
                .filter(e-> (10<=e) && (e<=20)).limit(2).forEach(e-> System.out.print(e+ " "));

    }

}
