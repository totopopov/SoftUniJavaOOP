package app.models.DataProcessor;

import app.waste_disposal.contracts.ProcessingData;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 1:23.
 */
public class DataProcessor implements ProcessingData {

    private double emergyBalance;
    private double capitalBalance;

    public DataProcessor(double emergyBalance, double capitalBalance) {
        this.emergyBalance = emergyBalance;
        this.capitalBalance = capitalBalance;
    }

    @Override
    public double getEnergyBalance() {
        return this.emergyBalance;
    }

    @Override
    public double getCapitalBalance() {
        return this.capitalBalance;
    }
}
