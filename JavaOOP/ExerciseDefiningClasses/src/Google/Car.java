package Google;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 0:08.
 */
public class Car {
    private String name;
    private int carSpeed;

    public Car(String name, int carSpeed) {
        this.name = name;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %d%n", this.name, this.carSpeed);
    }
}
