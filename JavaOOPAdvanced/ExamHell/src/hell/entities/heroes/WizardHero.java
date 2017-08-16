package hell.entities.heroes;

import hell.interfaces.Inventory;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 15:49.
 */
public class WizardHero extends BaseHero {

    public WizardHero(String name, Inventory inventory) {
        super(name, 25, 25, 100, 100, 250, inventory);
    }
}
