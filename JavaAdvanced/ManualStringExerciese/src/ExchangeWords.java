import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class ExchangeWords {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        char[] word1 = input[0].toCharArray();
        char[] word2 = input[1].toCharArray();
        LinkedHashSet<Character> element1 = new LinkedHashSet<>();
        LinkedHashSet<Character> element2 = new LinkedHashSet<>();
        for (char c : word1) {
            element1.add(c);
        }
        for (char c : word2) {
            element2.add(c);
        }
        boolean change = true;

        for (int i = 0; i < Math.min(word1.length, word2.length)-1; i++) {

            if ((word1[i] != word1[i + 1]) != (word2[i] != word2[i + 1])) {
                change = false;
            }
        }

        if (element1.size() != element2.size()) {
            change = false;
        }
        System.out.println(change);
    }
}
