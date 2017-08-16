import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Created by Lenovo on 11.2.2017 г..
 */
public class OfficeStuff {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, HashMap<String, Integer>> dataSet = new LinkedHashMap<>();

        int rows = Integer.parseInt(reader.readLine());

        for (int i = 0; i < rows; i++) {
            String[] in = reader.readLine().split(" - ");

            String company = in[0].substring(1);
            Integer amout = Integer.parseInt(in[1]);
            String product = in[2].substring(0, in[2].length() - 1);

            dataSet.putIfAbsent(company, new LinkedHashMap<>());
            dataSet.get(company).putIfAbsent(product, 0);
            dataSet.get(company).put(product, dataSet.get(company).get(product) + amout);


        }
        dataSet.entrySet().stream().sorted((c1,c2)->c1.getKey().compareTo(c2.getKey())).forEach(c->
                System.out.println(c.getKey()+": "+c.getValue().entrySet().stream()
                        .map(p->p.getKey()+"-"+p.getValue().toString()).collect(joining(", "))));
    }
}
