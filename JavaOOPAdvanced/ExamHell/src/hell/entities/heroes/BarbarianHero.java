package hell.entities.heroes;

import hell.interfaces.Inventory;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 15:46.
 */
public class BarbarianHero extends BaseHero {

    public BarbarianHero(String name, Inventory inventory) {
        super(name, 90, 25, 10, 350, 150, inventory);
    }
}
