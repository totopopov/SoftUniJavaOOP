package Vehicles;

import Vehicles.vehicles.Car;
import Vehicles.vehicles.Truck;
import Vehicles.vehicles.Vehicle;

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
        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]));

        String[] truckTokens = reader.readLine().split(" ");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]));

        int lines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {
            String[] command = reader.readLine().split(" ");
            String action = command[0].toLowerCase();
            String vehicle = command[1].toLowerCase();
            double token = Double.parseDouble(command[2]);
            try {
                switch (action) {
                    case "drive":
                        if ("car".equals(vehicle)) {
                            car.drive(token);
                        } else {
                            truck.drive(token);
                        }
                        break;
                    case "refuel":
                        if ("car".equals(vehicle)) {
                            car.refuel(token);
                        } else {
                            truck.refuel(token);
                        }
                        break;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        System.out.println(String.format("Car: %.2f", car.getFuelQuontity()));
        System.out.println(String.format("Truck: %.2f", truck.getFuelQuontity()));
    }
}
