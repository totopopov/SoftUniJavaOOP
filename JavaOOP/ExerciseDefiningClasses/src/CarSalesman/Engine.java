package CarSalesman;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 4:35.
 */

public class Engine  {
    private String model;
    private int power;
    private Integer displacement;
    private String efficiency;


    public Engine(String model, int power, Integer displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency=null;
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement=null;
        this.efficiency=null;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
        this.displacement=null;
    }

    public String getModel() {
        return this.model;
    }

    public int getPower() {
        return this.power;
    }



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("  %s:",this.getModel()));
        sb.append(System.lineSeparator());
        sb.append(String.format("    Power: %d",this.getPower()));
        sb.append(System.lineSeparator());
        sb.append(String.format("    Displacement: %s"
                ,this.displacement==null?"n/a":this.displacement));
        sb.append(System.lineSeparator());
        sb.append(String.format("    Efficiency: %s"
                ,this.efficiency==null?"n/a":this.efficiency));
        return sb.toString();
    }
}
