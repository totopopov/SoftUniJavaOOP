package hell.entities.items;

import hell.interfaces.Item;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 15:31.
 */
public class CommonItem extends BaseItem {

    public CommonItem(String name, int strenghtBonus, int agilityBonus, int inteligenceBonus, int hitPointsBonus, int damageBonus) {
        super(name, strenghtBonus, agilityBonus, inteligenceBonus, hitPointsBonus, damageBonus);
    }

}
