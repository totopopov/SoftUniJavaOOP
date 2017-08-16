package WildFarm.Animals;

import WildFarm.Meal.Food;

import java.text.DecimalFormat;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 1:27.
 */
public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, double animalWeight, String livingRegion,String breed) {
        super(animalName, "Cat", animalWeight, livingRegion);
        this.breed=breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.makeSound();
        super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]",
                this.getAnimalType(),this.getAnimalName(),
                this.breed,new DecimalFormat("#.##############").format(this.getAnimalWeight()),
                this.getLivingRegion(),this.getFoodEaten());
    }
}
