package PokemonTrainer;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 23:28.
 */
public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return this.health;
    }

    public boolean checkElement(String string){
        if (this.element.equals(string)){
            return true;
        }
        this.health=this.health-10;
        return false;

    }

}
