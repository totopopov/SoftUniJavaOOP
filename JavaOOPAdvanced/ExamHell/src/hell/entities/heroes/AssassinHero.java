package hell.entities.heroes;

import hell.interfaces.Inventory;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 15:48.
 */
public class AssassinHero extends BaseHero {
    public AssassinHero(String name, Inventory inventory) {
        super(name, 25, 100, 15, 150, 300, inventory);
    }
}
