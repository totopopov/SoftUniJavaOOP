import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LegendaryFarming {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, Integer> junk = new TreeMap<>();
        TreeMap<String, Integer> items = new TreeMap<>();

        String item="";

        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        boolean mining = true;


        while (mining) {
            String[] inputLines = reader.readLine().toLowerCase().split(" ");


            for (int i = 0; i < inputLines.length; i += 2) {

                String rocks= inputLines[i+1];
                int quantity= Integer.parseInt(inputLines[i]);

                if (items.containsKey(rocks)) {
                    items.put(rocks, items.get(rocks) +quantity);

                    if (items.get(rocks)>=250){
                       item=rocks.equals("shards")?"Shadowmourne":rocks.equals("motes")?"Dragonwrath":"Valanyr";
                        items.put(rocks,items.get(rocks)-250);
                       mining=false;
                       break;
                    }
                } else {
                    if (!junk.containsKey(rocks)){
                        junk.put(rocks,0);
                    }
                    junk.put(rocks, junk.get(rocks)+quantity);
                }
            }

        }

        System.out.println(String.format("%s obtained!",item));

        items.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).forEach(pair->{
            System.out.println(String.format("%s: %d",pair.getKey(),pair.getValue()));
        });

        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.println(String.format("%s: %d",entry.getKey(), entry.getValue()));
        }


    }
}
