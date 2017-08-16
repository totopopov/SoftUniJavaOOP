package app.models.waste;

import app.waste_disposal.contracts.Waste;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 0:51.
 */
public abstract class BaseWaste implements Waste {

    private String name;
    private double weight;
    private double volumePerKg;

    protected BaseWaste(String name,  double weight,double volumePerKg) {
        this.name = name;
        this.weight = weight;
        this.volumePerKg = volumePerKg;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getVolumePerKg() {
        return this.volumePerKg;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
