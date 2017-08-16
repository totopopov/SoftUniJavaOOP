package app.conntacts;

import app.waste_disposal.contracts.GarbageProcessor;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.StrategyHolder;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 4:14.
 */
public interface DataManagerAble {
    void processData(ProcessingData processingData);

    double getEnergy();

    double getCapital();

    StrategyHolder getStrategyHolder();

    GarbageProcessor getGarbageProcessor();
}
