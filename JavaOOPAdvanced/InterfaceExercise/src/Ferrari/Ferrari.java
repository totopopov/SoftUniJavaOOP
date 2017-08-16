package Ferrari;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 19:06.
 */
public class Ferrari implements Car {
    private String name;

    public Ferrari(String name) {
        this.name = name;
    }

    @Override
    public String pushBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushGasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return Car.MODEL+"/"+this.pushBrakes()+"/"+this.pushGasPedal()+"/"+this.name;
    }
}
