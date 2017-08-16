import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Lenovo on 7.2.2017 г..
 */


public class FilterAge {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Integer> dataset = new LinkedHashMap<>();

        int lines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {

            String[] currentEntry = reader.readLine().split(", ");

            dataset.put(currentEntry[0],Integer.parseInt(currentEntry[1]));

        }

        String relation = reader.readLine();
        Integer referenceAge=Integer.parseInt(reader.readLine());
        String print=reader.readLine();

        Predicate<Integer> tester =relation.equals("older")?x->x>=referenceAge:x->x<referenceAge;

        Consumer<Map.Entry<String, Integer>> printer =print.equals("name")?
                e-> System.out.println(e.getKey()):
                print.equals("age")?e-> System.out.println(e.getValue()):
                e-> System.out.println(String.format("%s - %d",e.getKey(),e.getValue()));

        printFilteredStudents(dataset,tester,printer);

    }

    private static void printFilteredStudents(LinkedHashMap<String,
            Integer> dataset, Predicate<Integer> tester, Consumer<Map.Entry<String, Integer>> printer) {

        for (Map.Entry<String, Integer> entry : dataset.entrySet()) {

            if (tester.test(entry.getValue())){
                printer.accept(entry);
            }
        }

    }
}
