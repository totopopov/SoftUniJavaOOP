package FoodShortage;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 19:18.
 */
public class Rebel implements Buyer {
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public void BuyFood() {
    this.food+=5;
    }
}
