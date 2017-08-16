package WildFarm;

import WildFarm.Animals.*;
import WildFarm.Meal.Food;
import WildFarm.Meal.Meat;
import WildFarm.Meal.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 1:20.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while (!"End".equals(input=reader.readLine())){
            String[] tokens=input.split(" ");

            String type =tokens[0];
            String name =tokens[1];
            double weight =Double.parseDouble(tokens[2]);
            String livingRegion =tokens[3];

            String[] inputFood=reader.readLine().split(" ");

            int quantity=Integer.parseInt(inputFood[1]);

            Food food=inputFood[0].equals("Vegetable")? new Vegetable(quantity):new Meat(quantity);
            Animal animal=null;

            switch (type){
                case "Tiger":
                     animal=new Tiger(name,weight,livingRegion);
                    break;
                case "Cat":
                    animal=new Cat(name,weight,livingRegion,tokens[4]);
                    break;
                case"Zebra":
                    animal=new Zebra(name,weight,livingRegion);
                    break;
                case"Mouse":
                    animal=new Mouse(name,weight,livingRegion);
                  break;
            }
            try {
                animal.eat(food);
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
            System.out.println(animal);

        }

    }
}
