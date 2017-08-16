package WildFarm.Animals;

import WildFarm.Meal.Food;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 1:22.
 */
public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.setFoodEaten(0);
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    protected void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);
}
