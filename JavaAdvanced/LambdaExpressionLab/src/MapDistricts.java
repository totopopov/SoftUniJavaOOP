import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Lenovo on 10.2.2017 г..
 */
public class MapDistricts {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Integer limit = Integer.parseInt(reader.readLine());

        HashMap<String, ArrayList<Integer>> dataSet = new HashMap<>();

        for (String info : input) {

            String[] split = info.split(":");
            String name = split[0];
            Integer district = Integer.parseInt(split[1]);

            dataSet.putIfAbsent(name, new ArrayList<>());
            dataSet.get(name).add(district);
        }

        dataSet.entrySet().stream().filter(e -> e.getValue().stream().mapToInt(l -> l).sum() > limit)
                .sorted((e1, e2) ->
                        Integer.compare(e2.getValue().stream().mapToInt(l -> l).sum(),
                                e1.getValue().stream().mapToInt(l -> l).sum())).forEach(pair -> {
            System.out.printf("%s: ",pair.getKey());
            pair.getValue().stream().sorted((k1,k2)->k2.compareTo(k1)).limit(5).forEach(e-> System.out.printf("%s ",e));
            System.out.println();
        });

    }
}
