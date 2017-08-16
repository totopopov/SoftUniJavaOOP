import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Lenovo on 30.1.2017 г..
 */
public class LogsAgg {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(reader.readLine());

        TreeMap<String,Integer> userTime= new TreeMap<>();
        TreeMap<String , TreeSet<String>> userEntries = new TreeMap<>();


        for (int i = 0; i < lines; i++) {

            String[] input = reader.readLine().split(" ");
            String ip=input[0];
            String name = input[1];
            int time = Integer.parseInt(input[2]);

            boolean entered=false;

            if (!userTime.containsKey(name)){
                userTime.put(name,0);

                TreeSet<String> ips= new TreeSet<>();

                ips.add(ip);

                userEntries.put(name,ips);

                entered=true;
            }
            userTime.put(name,userTime.get(name)+time);

            if (!entered){
                userEntries.get(name).add(ip);
            }

        }

        for (String s : userTime.keySet()) {
            System.out.println(s+": "+userTime.get(s)+ " ["+String.join(", ", userEntries.get(s))+"]");
        }



    }

}
