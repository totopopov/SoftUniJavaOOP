package Vehicles.vehicles;

/**
 * Created by Todor Popov using Lenovo on 7.3.2017 г. at 3:34.
 */
public abstract class Vehicle {
    private double fuelQuontity;
    private double consumption;

    public Vehicle(double fuelQuontity, double consumption) {
        this.setFuelQuontity(fuelQuontity);
        this.setConsumption(consumption);
    }

    public double getFuelQuontity() {
        return this.fuelQuontity;
    }

    private void setFuelQuontity(double fuelQuontity) {
        this.fuelQuontity = fuelQuontity;
    }

    public double getConsumption() {
        return this.consumption;
    }

    private void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    protected void driveSuccess(double fuel){
        this.setFuelQuontity(this.getFuelQuontity()-fuel);
    }

    protected void addFuel(double fuel){
        this.setFuelQuontity(this.getFuelQuontity()+fuel);
    }

    public abstract void drive(double distance);

    public abstract void refuel(double fuel);


}
