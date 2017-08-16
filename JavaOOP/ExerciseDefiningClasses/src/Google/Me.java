package Google;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 0:11.
 */
public class Me extends Person {
    private Car car;
    private Compnay compnay;
    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon> pokemons;


    public Me(String name) {
        super(name);
        this.children = new LinkedList<>();
        this.parents = new LinkedList<>();
        this.pokemons = new LinkedList<>();
        this.car = null;
        this.compnay = null;
    }


    public void setCar(Car car) {
        this.car = car;
    }

    public void setCompnay(Compnay compnay) {
        this.compnay = compnay;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    public void addChild(Child child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getName()).append(System.lineSeparator());
        sb.append("Company:").append(System.lineSeparator());
        sb.append(this.compnay == null ? "" : this.compnay.toString());
        sb.append("Car:").append(System.lineSeparator());
        sb.append(this.car == null ? "" : this.car.toString());
        sb.append("Pokemon:").append(System.lineSeparator());

        if (!this.pokemons.isEmpty()) {
            this.pokemons.forEach(sb::append);
        }
        sb.append("Parents:").append(System.lineSeparator());
        if (!this.parents.isEmpty()) {
            this.parents.forEach(sb::append);
        }
        sb.append("Children:").append(System.lineSeparator());
        if (!this.children.isEmpty()) {
            this.children.forEach(sb::append);
        }

        return sb.toString();
    }
}
