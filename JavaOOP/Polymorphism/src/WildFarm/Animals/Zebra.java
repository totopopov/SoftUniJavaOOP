package WildFarm.Animals;

import WildFarm.Meal.Food;

import java.text.DecimalFormat;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 1:27.
 */
public class Zebra extends Mamal {
    public Zebra(String animalName,  double animalWeight, String livingRegion) {
        super(animalName, "Zebra", animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
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
                this.getLivingRegion(),this.getFoodEaten());
    }
}
