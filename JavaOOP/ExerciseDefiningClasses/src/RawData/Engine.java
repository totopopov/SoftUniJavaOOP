package RawData;

/**
 * Created by Todor Popov using Lenovo on 22.2.2017 г. at 18:34.
 */
public class Engine {

    private int speed;
    private int power;

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    protected int getSpeed() {
        return speed;
    }

    protected int getPower() {
        return power;
    }
}
