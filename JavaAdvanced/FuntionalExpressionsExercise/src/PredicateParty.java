import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 9.2.2017 г..
 */
public class PredicateParty {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = (reader.readLine().split(" "));
        LinkedHashMap<String, Integer> data = new LinkedHashMap<>();

        for (String s : input) {
            if (!data.containsKey(s)) {
                data.put(s, 0);
            }
            data.put(s, data.get(s) + 1);
        }

        String line;

        Predicate<String> checkRemove = e -> "Remove".equals(e);
        Predicate<String> checkDouble = e -> "Double".equals(e);
        Predicate<String> checkParty = e -> "Party!".equals(e);
        Predicate<String> startWith = e -> "StartsWith".equals(e);
        Predicate<String> endWith = e -> "EndsWith".equals(e);
        Predicate<String> Lenght = e -> "Lenght".equals(e);


        while (!checkParty.test(line = reader.readLine())) {

            String[] commands = line.split(" ");

            String rOrD = commands[0];
            String filter = commands[1];
            String token = commands[2];
            for (Map.Entry<String, Integer> entry : data.entrySet()) {

                if (checkDouble.test(rOrD)) {
                    if (startWith.test(filter)) {
                        if (entry.getKey().length() > token.length() && entry.getKey().substring(0, token.length()).equals(token)) {
                            entry.setValue(entry.getValue() * 2);
                        }
                    } else if (endWith.test(filter)) {
                        if (entry.getKey().length() > token.length()
                                && entry.getKey().substring(entry.getKey().length() - token.length()).equals(token)) {
                            entry.setValue(entry.getValue() * 2);
                        }
                    } else {
                        if (entry.getKey().length() == Integer.parseInt(token)) {
                            entry.setValue(entry.getValue() * 2);
                        }
                    }

                } else if (checkRemove.test(rOrD)) {
                    if (startWith.test(filter)) {
                        if (entry.getKey().length() > token.length() && entry.getKey().substring(0, token.length()).equals(token)) {
                            entry.setValue(0);
                        }
                    } else if (endWith.test(filter)) {
                        if (entry.getKey().length() > token.length()
                                && entry.getKey().substring(entry.getKey().length() - token.length()).equals(token)) {
                            entry.setValue(0);
                        }
                    } else {
                        if (entry.getKey().length() == Integer.parseInt(token)) {
                            entry.setValue(0);
                        }
                    }
                }

            }
        }
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey()).append(", ");
            }
        }

        if (sb.length() == 0) {
            System.out.println("Nobody is going to the party!");
        } else {
            sb.delete(sb.length() - 2, sb.length());
            sb.append(" are going to the party!");
            System.out.println(sb);
        }

    }

}
