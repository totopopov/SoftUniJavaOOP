package MordorsCrueltyPlan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 1:00.
 */
public class Stomach {
    private List<Food> foods;

    public Stomach() {
        this.setFoods(new ArrayList<>());
    }

    private List<Food> getFoods() {
        return this.foods;
    }

    private void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public void addFood(Food food){
        this.getFoods().add(food);
    }

    public int calculateHappiness(){
        int happiness=0;

        for (Food food : this.getFoods()) {
            happiness+=food.getPoints();
        }
        return happiness;
    }

    public String getMood() {
        int happiness=this.calculateHappiness();

       if (happiness<-5){
            return "Angry";
       } else if (happiness<0){
           return "Sad";
       } else if (happiness<15){
           return "Happy";
       } else {
           return "JavaScript";
       }
    }
}
