package trafficLights;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 21:31.
 */
public class TrafficLight {
    private Lights lights;

    public TrafficLight(String lights) {
        this.lights = Lights.valueOf(lights.toUpperCase());
    }

    public Lights getLights() {
        return lights;
    }

    public void switchLight(){
        this.lights= Lights.values()[((this.lights.ordinal()+1)%3)];
    }


    @Override
    public String toString() {
        return this.getLights().name();
    }
}
