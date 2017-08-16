import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lenovo on 31.1.2017 г..
 */
public class testingHashMap {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] keyWords=reader.readLine().split(" ");

        HashMap<String,Integer> counts=new HashMap<>();

        for (String s : keyWords) {
            counts.put(s,0);
        }

        String[] text=reader.readLine().split(" ");

        for (String s : text) {
            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                if (entry.getKey().compareToIgnoreCase(s)==0){
                    counts.put(entry.getKey(),counts.get(entry.getKey())+1);
                }
            }
        }

        for (Map.Entry<String, Integer> entries : counts.entrySet()) {

            System.out.println(entries.getKey() + " - "+ entries.getValue());
        }

    }

}
