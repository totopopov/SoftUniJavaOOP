package AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 24.2.2017 г. at 20:12.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        double age =Double.parseDouble(reader.readLine());

        try {
            Chicken chicken=new Chicken(name,age);
            System.out.println(String.format("Chicken %s (age %.0f) can produce %s eggs per day.",chicken.getName(),chicken.getAge(),chicken.getProduction()));

        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }

}
