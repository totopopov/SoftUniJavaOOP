package app.models.waste;

import app.annotations.Burnable;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 1:38.
 */

@Burnable
public class BurnableWaste extends BaseWaste {
    public BurnableWaste(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
