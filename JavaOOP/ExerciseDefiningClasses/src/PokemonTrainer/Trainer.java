package PokemonTrainer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 23:29.
 */
public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemonList = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getBadges() {
        return badges;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public void fightWithElemt(String element) {
        if (this.pokemonList.stream().filter(p -> p.checkElement(element)).map(p -> p.checkElement(element))
                .reduce(((p1, p2) -> (p1 || p2))).orElse(false)) {
            this.badges = this.badges + 1;
            return;
        }

        List<Pokemon> toBeRemoved=new LinkedList<>();

        this.pokemonList.forEach(p -> {
            if (p.getHealth() <= 0) {
                toBeRemoved.add(p);
            }
        });

        if (!toBeRemoved.isEmpty()){
            toBeRemoved.forEach(r-> this.pokemonList.remove(r));
        }
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getBadges()+" "+this.pokemonList.size();
    }
}


