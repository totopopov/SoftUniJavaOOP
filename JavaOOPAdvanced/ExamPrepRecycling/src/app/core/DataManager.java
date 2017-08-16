package app.core;

import app.conntacts.DataManagerAble;
import app.waste_disposal.contracts.GarbageProcessor;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.StrategyHolder;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 4:12.
 */
public class DataManager implements DataManagerAble {
    private double energy;
    private double capital;
    private StrategyHolder strategyHolder;
    private GarbageProcessor garbageProcessor;

    public DataManager(GarbageProcessor garbageProcessor) {
        this.garbageProcessor = garbageProcessor;
        this.strategyHolder = this.garbageProcessor.getStrategyHolder();
    }

    @Override
    public void processData(ProcessingData processingData){
        this.energy+=processingData.getEnergyBalance();
        this.capital+=processingData.getCapitalBalance();
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public double getCapital() {
        return this.capital;
    }

    @Override
    public StrategyHolder getStrategyHolder() {
        return strategyHolder;
    }

    @Override
    public GarbageProcessor getGarbageProcessor() {
        return garbageProcessor;
    }
}
