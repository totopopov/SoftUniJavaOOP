package CarShop;

import javax.management.modelmbean.ModelMBean;
import java.io.Serializable;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 15:39.
 */
public class Seat implements Serializable, Car{
    private String model;
    private String color;
    private int horsePower;
    private String countryProdced;

    public Seat(String model, String color, Integer horsePower, String countryProdced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProdced = countryProdced;
    }



    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",this.getModel(),this.countryProdced, this.TIRES);
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }
}
