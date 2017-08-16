package VehiclesUpdated.Vehicles;

import java.text.DecimalFormat;

/**
 * Created by Todor Popov using Lenovo on 7.3.2017 г. at 3:40.
 */
public class Car extends Vehicle {

    public Car(double fuelQuontity, double consumption, int tankCapacity) {
        super(fuelQuontity, consumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double neededFuel=(this.getConsumption()+0.9)*distance;
        if ((this.getFuelQuontity()-neededFuel)<0){
            throw new IllegalArgumentException("Car needs refueling");
        }
        super.driveSuccess(neededFuel);
        System.out.println(String.format("Car travelled %s km",new DecimalFormat("#.##############").format(distance)));
    }

    @Override
    public void refuel(double fuel) {
        if (super.getFuelQuontity()+fuel>super.getTankCapacity())
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        super.addFuel(fuel);
    }
}
