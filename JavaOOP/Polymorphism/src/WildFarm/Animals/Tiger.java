package WildFarm.Animals;

import WildFarm.Meal.Food;

import java.text.DecimalFormat;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 1:27.
 */
public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName,  double animalWeight, String livingRegion) {
        super(animalName, "Tiger", animalWeight, livingRegion);
        this.livingRegion=livingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        this.makeSound();
        super.eat(food);
    }
    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]",
                this.getAnimalType(),this.getAnimalName(),
                new DecimalFormat("#.##############").format(this.getAnimalWeight()),
                this.livingRegion,this.getFoodEaten());
    }
}
