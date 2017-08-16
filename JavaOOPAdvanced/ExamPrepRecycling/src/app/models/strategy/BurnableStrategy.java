package app.models.strategy;

import app.annotations.Burnable;
import app.waste_disposal.annotations.Disposable;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import app.models.DataProcessor.DataProcessor;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 2:07.
 */

@Burnable
public class BurnableStrategy implements GarbageDisposalStrategy {
    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double garbageVolume =garbage.getWeight()*garbage.getVolumePerKg();
        double energy= garbageVolume*0.8;
        double capitalEarned=garbageVolume*0;
        ProcessingData data = new DataProcessor(energy,capitalEarned);
        return data;
    }
}
