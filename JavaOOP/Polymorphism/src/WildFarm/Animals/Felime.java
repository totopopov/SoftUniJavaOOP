package WildFarm.Animals;

import WildFarm.Meal.Food;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 1:27.
 */
public abstract class Felime extends Mamal{
    public Felime(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")){
            throw new IllegalArgumentException(String.format("%ss are not eating that type of food!",super.getAnimalType()));

        }
        super.setFoodEaten(food.getQuantity());
    }
}
