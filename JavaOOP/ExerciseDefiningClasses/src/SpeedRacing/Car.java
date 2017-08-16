package SpeedRacing;

/**
 * Created by Todor Popov using Lenovo on 22.2.2017 г. at 21:17.
 */
public class Car {
   private String Model;
   private double fuelAmount;
   private double fuelCostFor1Kilometer;
   private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostFor1Kilometer) {
        Model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1Kilometer = fuelCostFor1Kilometer;
        this.distanceTraveled = 0d;
    }

    public static Car drive(Car car, double km){
        if (car.getFuelAmount()-(km*car.getFuelCostFor1Kilometer())>=0){
            car.setFuelAmount(car.getFuelAmount()-km*car.getFuelCostFor1Kilometer());
            car.setDistanceTraveled(car.getDistanceTraveled()+km);
            return car;

        } else {

            System.out.println("Insufficient fuel for the drive");
            return car;
        }

    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getDistanceTraveled() {
        return this.distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public double getFuelCostFor1Kilometer() {
        return this.fuelCostFor1Kilometer;
    }

    public String getModel() {
        return Model;
    }
}
