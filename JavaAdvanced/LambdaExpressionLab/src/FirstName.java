import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 9.2.2017 г..
 */
public class FirstName {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> names = new ArrayList<>();
        Arrays.asList((reader.readLine().split(" "))).stream().forEach(x -> names.add(x));

        LinkedHashSet<Character> filter = new LinkedHashSet<>();
        Arrays.stream(reader.readLine().split(" ")).distinct().map(c-> c.toLowerCase().charAt(0)).forEach(c->filter.add(c));


        Optional<String> first = names.stream().sorted().filter(n -> filter.contains(n.toLowerCase().charAt(0))).findFirst();

        if (first.isPresent()){
            System.out.println(first.get());
        }else {
            System.out.println("No match");
        }


    }


}
