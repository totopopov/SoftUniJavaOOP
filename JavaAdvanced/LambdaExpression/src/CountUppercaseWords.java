import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.function.Predicate;

/**
 * Created by Lenovo on 7.2.2017 г..
 */
public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Predicate<String> checkCase=s-> s.charAt(0)==s.toUpperCase().charAt(0);

        LinkedList<String> data = new LinkedList<>();

        for (String s : input) {
            if (checkCase.test(s)){
                data.add(s);
            }
        }

        System.out.println(data.size());

        for (String s : data) {
            System.out.println(s);
        }

    }


}
