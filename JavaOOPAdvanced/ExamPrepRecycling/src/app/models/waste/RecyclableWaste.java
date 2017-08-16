package app.models.waste;

import app.annotations.Recyclable;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 1:36.
 */

@Recyclable
public class RecyclableWaste extends BaseWaste {
    public RecyclableWaste(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
