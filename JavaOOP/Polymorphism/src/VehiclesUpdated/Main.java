package VehiclesUpdated;

import VehiclesUpdated.Vehicles.Bus;
import VehiclesUpdated.Vehicles.Car;
import VehiclesUpdated.Vehicles.Truck;
import VehiclesUpdated.Vehicles.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 7.3.2017 г. at 3:19.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]),
                Double.parseDouble(carTokens[2]), Integer.parseInt(carTokens[3]));

        String[] truckTokens = reader.readLine().split(" ");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]),
                Double.parseDouble(truckTokens[2]), Integer.parseInt(truckTokens[3]));

        String[] busTokens = reader.readLine().split(" ");
        Bus bus = new Bus(Double.parseDouble(busTokens[1]),
                Double.parseDouble(busTokens[2]), Integer.parseInt(busTokens[3]));


        int lines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {
            String[] command = reader.readLine().split(" ");
            String action = command[0].toLowerCase();
            String vehicle = command[1].toLowerCase();
            double token = Double.parseDouble(command[2]);
            try {
                switch (action) {
                    case "drive":
                        switch (vehicle) {
                            case "car":
                                car.drive(token);
                                break;
                            case "truck":
                                truck.drive(token);
                                ;
                                break;
                            case "bus":
                                bus.driveBus(token,true);
                                break;
                        }
                        break;

                    case "refuel":
                        switch (vehicle) {
                            case "car":
                                car.refuel(token);
                                break;
                            case "truck":
                                truck.refuel(token);
                                break;
                            case "bus":
                                bus.refuel(token);
                                break;

                        }
                        break;
                    case"driveempty":
                        bus.driveBus(token,false);
                        break;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        System.out.println(String.format("Car: %.2f", car.getFuelQuontity()));
        System.out.println(String.format("Truck: %.2f", truck.getFuelQuontity()));
        System.out.println(String.format("Bus: %.2f", bus.getFuelQuontity()));
    }
}
