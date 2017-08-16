package app.models.waste;

import app.annotations.Storable;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 1:38.
 */


@Storable
public class StorableWaste extends BaseWaste {
    public StorableWaste(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
