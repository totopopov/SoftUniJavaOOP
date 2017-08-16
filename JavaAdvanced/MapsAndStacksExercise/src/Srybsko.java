import jdk.nashorn.internal.ir.IfNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class Srybsko {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, LinkedHashMap<String, Long>> data = new LinkedHashMap<>();

        String input;

        while (!"End".equals(input =reader.readLine())){

            String[] tokens = input.split(" @");
            if (tokens.length!=2){
                continue;
            }

            String name = tokens[0];

            String[] secondTokens = tokens[1].split(" \\d+ ");

            if (secondTokens.length!=2) {
                continue;
            }

            String venue=secondTokens[0];

            String[] number=tokens[1].substring(venue.length()+1).split(" ");

            if (number.length!=2){
                continue;
            }

            long people=Integer.parseInt(number[1]);
            long price=Integer.parseInt(number[0]);
            long cost= people*price;

            if (!data.containsKey(venue)){
                data.put(venue, new LinkedHashMap<>());
            }

            if (!data.get(venue).containsKey(name)){
                data.get(venue).put(name,0L);
            }
            data.get(venue).put(name,data.get(venue).get(name)+cost);

        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : data.entrySet()) {

            System.out.println(entry.getKey());

            entry.getValue().entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).forEach(pair->{
                System.out.println(String.format("#  %s -> %d",pair.getKey(), pair.getValue()));
            });
        }

    }

}
