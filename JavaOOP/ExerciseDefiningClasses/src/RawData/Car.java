package RawData;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 22.2.2017 г. at 18:34.
 */


public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;


    public Car(String model, int speed, int power, int weight, String type,
               double pressure1, int age1,
               double pressure2, int age2,
               double pressure3, int age3,
               double pressure4, int age4) {
        this.model = model;
        this.engine = new Engine(speed,power);
        this.cargo = new Cargo(weight,type);
        this.tires = new LinkedList<>();
        this.tires.add(new Tire(pressure1,age1));
        this.tires.add(new Tire(pressure2,age2));
        this.tires.add(new Tire(pressure3,age3));
        this.tires.add(new Tire(pressure4,age4));
    }

    public String getModel() {
        return this.model;
    }

    public boolean isFragile(){
        return this.tires.stream().filter(t -> t.getPressure() < 1).count() > 0
                && this.cargo.getType().equals("fragile");
    }
    public boolean isFlamable(){
        return this.engine.getPower()>250 && this.cargo.getType().equals("flamable");
    }


}
