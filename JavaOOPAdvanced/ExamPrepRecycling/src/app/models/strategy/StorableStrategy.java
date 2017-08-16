package app.models.strategy;

import app.annotations.Storable;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import app.models.DataProcessor.DataProcessor;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 2:08.
 */

@Storable
public class StorableStrategy implements GarbageDisposalStrategy {
    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double garbageVolume =garbage.getWeight()*garbage.getVolumePerKg();
        double energy= garbageVolume*0.13*-1;
        double capitalEarned=garbageVolume*0.65*-1;
        ProcessingData data = new DataProcessor(energy,capitalEarned);
        return data;
    }
}
