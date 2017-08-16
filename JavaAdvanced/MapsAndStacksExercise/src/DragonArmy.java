import jdk.nashorn.internal.ir.IfNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class DragonArmy {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, TreeMap<String, int[]>> data = new LinkedHashMap<>();

        int lines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {

            String[] input = reader.readLine().split(" ");

            String name = input[1];
            String dragonClass = input[0];

            int damage = ("null".equals(input[2])) ? 45 : Integer.parseInt(input[2]);
            int health = ("null".equals(input[3])) ? 250 : Integer.parseInt(input[3]);
            int armor = ("null".equals(input[4])) ? 10 : Integer.parseInt(input[4]);

            int[] stats = {damage, health, armor};

            if (!data.containsKey(dragonClass)) {
                data.put(dragonClass, new TreeMap<>());
            }
            data.get(dragonClass).put(name, stats);

        }


        for (Map.Entry<String, TreeMap<String, int[]>> entry : data.entrySet()) {

            double avgDamage = 0.0;
            double avgHealth = 0.0;
            double avgArmor = 0.0;
            int size = entry.getValue().size();

            for (Map.Entry<String, int[]> statEntry : entry.getValue().entrySet()) {

                avgDamage += statEntry.getValue()[0];
                avgHealth += statEntry.getValue()[1];
                avgArmor += statEntry.getValue()[2];
            }

            avgDamage = avgDamage / size;
            avgHealth = avgHealth / size;
            avgArmor = avgArmor / size;


            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", entry.getKey(), avgDamage, avgHealth, avgArmor));


            for (Map.Entry<String, int[]> stats : entry.getValue().entrySet()) {


                System.out.
                        println(String.format("-%s -> damage: %d, health: %d, armor: %d",
                                stats.getKey(), stats.getValue()[0], stats.getValue()[1], stats.getValue()[2]));
            }

        }


    }

}
