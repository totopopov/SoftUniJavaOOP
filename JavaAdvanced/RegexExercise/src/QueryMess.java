import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class QueryMess {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        String replace="((%20)|(\\+))+";


        while (!"END".contains(line=reader.readLine())){

            String[] input=line.split("[&\\?]+");

            LinkedHashMap<String,ArrayList<String>> data = new LinkedHashMap<>();


            for (String s : input) {
                s=s.replaceAll(replace," ");
                if (s.contains("=")){

                    String[] split=s.split("=");

                    String key = split[0].trim();



                    if (!data.containsKey(key)){
                        data.put(key, new ArrayList<String>());
                    }

                    data.get(key).add(split[1].trim());

                }

            }

            for (Map.Entry<String, ArrayList<String>> entry : data.entrySet()) {

                System.out.print(String.format("%s=[%s]",entry.getKey(),String.join(", ",entry.getValue())));
            }

            System.out.println();
        }

    }

}
