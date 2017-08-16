package VehiclesUpdated.Vehicles;

import java.text.DecimalFormat;

/**
 * Created by Todor Popov using Lenovo on 7.3.2017 г. at 3:53.
 */
public class Truck extends Vehicle {

    public Truck(double fuelQuontity, double consumption, int tankCapacity) {
        super(fuelQuontity, consumption, tankCapacity);
    }


    @Override
    public void drive(double distance) {
        double neededFuel=(this.getConsumption()+1.6)*distance;
        if ((this.getFuelQuontity()-neededFuel)<0){
            throw new IllegalArgumentException("Truck needs refueling");
        }
        super.driveSuccess(neededFuel);
        System.out.println(String.format("Truck travelled %s km",new DecimalFormat("#.##############").format(distance)));
    }

    @Override
    public void refuel(double fuel) {
        super.addFuel(fuel*0.95);
    }
}
