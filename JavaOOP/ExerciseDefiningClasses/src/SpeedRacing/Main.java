package SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Todor Popov using Lenovo on 22.2.2017 г. at 21:16.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int carNumbers=Integer.parseInt(reader.readLine());

        HashMap<String,Car> data=new LinkedHashMap<>();

        while (carNumbers-->0){
          String[] dataEntry=reader.readLine().split(" ");

          String model = dataEntry[0];
          double fuel = Double.parseDouble(dataEntry[1]);
          double fuelConsumption = Double.parseDouble(dataEntry[2]);

          Car currentCar=new Car(model,fuel,fuelConsumption);

          data.put(model,currentCar);
        }

        String command;

        while (!"End".equals(command=reader.readLine())){

            String[] tokens=command.split(" ");

            String model = tokens[1];
            double distance = Double.parseDouble(tokens[2]);

            data.put(model,Car.drive(data.get(model),distance) );
        }

        for (Map.Entry<String, Car> entry : data.entrySet()) {
            System.out.println( String.format("%s %.2f %.0f",entry.getKey(),entry.getValue().getFuelAmount(),
                    entry.getValue().getDistanceTraveled()));
        }

    }

}
