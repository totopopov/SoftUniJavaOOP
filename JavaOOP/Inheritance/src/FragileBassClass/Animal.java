package FragileBassClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 18:47.
 */
public class Animal {
    protected List<Food> foodEaten;

    public Animal(){
        this.foodEaten=new ArrayList<>();
    }

    public final void eat(Food food){
        this.foodEaten.add(food);
    }

    public void eatAll(Food[] foods){
        for (Food food : foods) {
            this.eat(food);
        }
    }


}
