package coffeMachineProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 16:57.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CoffeeMachineAble cofffeeMachine = new CoffeeMachine();
        String input;

        while(!"END".equals(input=reader.readLine())){

            String[] tokens = input.split(" ");

            if (tokens.length==1){
                cofffeeMachine.insertCoin(tokens[0].toUpperCase());
            } else {
                cofffeeMachine.buyCoffee(tokens[0].toUpperCase(),tokens[1].toUpperCase());
            }
        }

        for (Coffee coffee : cofffeeMachine.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}
