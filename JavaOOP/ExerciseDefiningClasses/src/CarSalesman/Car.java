package CarSalesman;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 4:35.
 */
public class Car {
    private String model;
    private Engine engine;
    private Integer weight;
    private String color;

    public Car(String model, Engine engine, Integer weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = null;
        this.color = null;
    }

    public Car(String model, Engine engine, Integer weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color=null;
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.weight=null;
        this.color = color;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s:",this.model)).append(System.lineSeparator());
        sb.append(this.engine.toString());
        sb.append(System.lineSeparator());
        sb.append(String.format("  Weight: %s",
                this.weight==null?"n/a":this.weight));
        sb.append(System.lineSeparator());
        sb.append(String.format("  Color: %s",
                this.color==null?"n/a":this.color));

        return sb.toString();
    }
}
