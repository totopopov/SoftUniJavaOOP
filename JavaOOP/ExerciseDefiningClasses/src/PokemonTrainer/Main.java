package PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 23:28.
 */
public class Main {
    public static void main(String[] args) throws IOException {


        HashMap<String, Trainer> trainers = new LinkedHashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while (!"Tournament".equals(input = reader.readLine())) {
            String[] inputArgs = input.split(" ");
            String trainerName = inputArgs[0];
            Pokemon pokemon = new Pokemon(inputArgs[1], inputArgs[2], Integer.parseInt(inputArgs[3]));

            if (trainers.containsKey(trainerName)) {
                trainers.get(trainerName).addPokemon(pokemon);
            } else {
                Trainer trainer = new Trainer(trainerName);
                trainer.addPokemon(pokemon);
                trainers.put(trainerName, trainer);
            }
        }

        while (!"End".equals(input = reader.readLine())) {

            for (Map.Entry<String, Trainer> entry : trainers.entrySet()) {
                entry.getValue().fightWithElemt(input);
            }

        }

        trainers.values().stream().sorted((t1,t2)->Integer.compare(t2.getBadges(),t1.getBadges()))
                .forEach(t-> System.out.println(t.toString()));
    }
}
