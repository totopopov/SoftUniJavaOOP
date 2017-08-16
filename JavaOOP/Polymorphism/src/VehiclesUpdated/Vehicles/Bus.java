package VehiclesUpdated.Vehicles;

import java.text.DecimalFormat;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 22:46.
 */
public class Bus extends Vehicle {
    private boolean isloaded;

    public Bus(double fuelQuontity, double consumption, int tankCapacity) {
        super(fuelQuontity, consumption, tankCapacity);
        this.isloaded = false;
    }

    public boolean isIsloaded() {
        return isloaded;
    }

    private void setIsloaded(boolean isloaded) {
        this.isloaded = isloaded;
    }

    public void driveBus(double distance, boolean isLoaded) {
        this.setIsloaded(isLoaded);
        this.drive(distance);
    }

    @Override
    public void drive(double distance) {
        double addedFuel = this.isIsloaded() ? 1.4 : 0.0;
        double neededFuel = (this.getConsumption() + addedFuel) * distance;
        if ((this.getFuelQuontity() - neededFuel) < 0) {
            throw new IllegalArgumentException("Bus needs refueling");
        }
        super.driveSuccess(neededFuel);
        System.out.println(String.format("Bus travelled %s km", new DecimalFormat("#.##############").format(distance)));
    }

    @Override
    public void refuel(double fuel) {
        if (super.getFuelQuontity() + fuel > super.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.addFuel(fuel);
    }
}