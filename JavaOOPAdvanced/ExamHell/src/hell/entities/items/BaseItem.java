package hell.entities.items;

import hell.interfaces.Item;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 19:24.
 */
public abstract class BaseItem implements Item {
    private String name;
    private int strenghtBonus;
    private int agilityBonus;
    private int inteligenceBonus;
    private int hitPointsBonus;
    private int damageBonus;


    protected BaseItem(String name, int strenghtBonus, int agilityBonus, int inteligenceBonus, int hitPointsBonus, int damageBonus) {
        this.name = name;
        this.strenghtBonus = strenghtBonus;
        this.agilityBonus = agilityBonus;
        this.inteligenceBonus = inteligenceBonus;
        this.hitPointsBonus = hitPointsBonus;
        this.damageBonus = damageBonus;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStrengthBonus() {
        return this.strenghtBonus;
    }

    @Override
    public int getAgilityBonus() {
        return this.agilityBonus;
    }

    @Override
    public int getIntelligenceBonus() {
        return this.inteligenceBonus;
    }

    @Override
    public int getHitPointsBonus() {
        return this.hitPointsBonus;
    }

    @Override
    public int getDamageBonus() {
        return this.damageBonus;
    }
}
