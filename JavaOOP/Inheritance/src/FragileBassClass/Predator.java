package FragileBassClass;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 18:47.
 */
public class Predator extends Animal{

    private int health;

    public void feed(Food food){
        super.eat(food);
        this.health++;
    }

    public void feedAll(Food[] foods){
        super.eatAll(foods);
        this.health+=foods.length;
    }

}
