package RawData;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 4:07.
 */
public class Tire {
    private double pressure;
    private int age;

    public Tire(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    protected double getPressure() {
        return pressure;
    }

    protected int getAge() {
        return age;
    }
}
