package app.models.strategy;

import app.annotations.Recyclable;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import app.models.DataProcessor.DataProcessor;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 0:59.
 */

@Recyclable
public class RecyclableStrategy implements GarbageDisposalStrategy {

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double garbageVolume =garbage.getWeight()*garbage.getVolumePerKg();
        double energy= garbageVolume*0.5*-1;
        double capitalEarned=garbage.getWeight()*400;
        ProcessingData data = new DataProcessor(energy,capitalEarned);
        return data;
    }
}
