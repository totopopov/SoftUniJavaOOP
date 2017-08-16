package PIzzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 25.2.2017 г. at 3:31.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String command;

        while (!"END".equals(command = reader.readLine())) {


            String[] tokens = command.split(" ");

            switch (tokens[0].toLowerCase()) {

                case "pizza":
                    try {

                        String pizzaName = tokens[1];
                        int toppingNumer = Integer.parseInt(tokens[2]);
                        Pizza pizza = new Pizza(pizzaName, toppingNumer);

                        tokens = reader.readLine().split(" ");

                        Dough dough = getDough(tokens);

                        pizza.setDough(dough);

                        for (int i = 0; i < pizza.getToppingsNumber(); i++) {
                            tokens = reader.readLine().split(" ");
                            Topping topping = getTopping(tokens);
                            pizza.addTopping(topping, i);
                        }

                        System.out.printf("%s - %.2f", pizzaName, pizza.calculateCalroies());


                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                        return;
                    }

                    break;


                case "dough":

                    try {

                        Dough dough = getDough(tokens);

                        System.out.println(String.format("%.2f", dough.calculateCalories()));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                        return;
                    }

                    break;

                case "topping":

                    try {
                        Topping topping = getTopping(tokens);

                        System.out.println(String.format("%.2f", topping.getToppingCallories()));
                    } catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                        return;
                    }
                    break;
            }

        }
    }

    private static Topping getTopping(String[] tokens) {
        double toppingWeight = Double.parseDouble(tokens[2]);
        String toppingName = tokens[1];
        return new Topping(toppingWeight, toppingName);
    }

    private static Dough getDough(String[] tokens) {
        double doughWeight = Double.parseDouble(tokens[3]);
        String doughName = tokens[1];
        String doughType = tokens[2];

        return new Dough(doughWeight, doughName, doughType);
    }

}
