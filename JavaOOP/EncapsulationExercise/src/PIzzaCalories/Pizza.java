package PIzzaCalories;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 25.2.2017 г. at 5:00.
 */
public class Pizza {
    private String name;
    private Dough dough;
    private Topping[] toppings;


    public Pizza(String name, int toppingsNumber) {
        this.setName(name);
        this.setToppings(new Topping[toppingsNumber]);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {

        if (name==null || name.trim().isEmpty()|| name.length()<1 || name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    private Dough getDough() {
        return this.dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private Topping[] getToppings() {
        return this.toppings;
    }

    private void setToppings(Topping[] toppings) {
        if (toppings.length>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

        this.toppings = toppings;
    }

    public int getToppingsNumber(){
        return this.getToppings().length;
    }


    public void addTopping(Topping topping, int index){
         this.getToppings()[index]=topping;
    }

    public double calculateCalroies(){
        return  this.getDough().calculateCalories()+ Arrays.stream(this.getToppings())
                .mapToDouble(p->p.getToppingCallories()).sum();

    }

}
