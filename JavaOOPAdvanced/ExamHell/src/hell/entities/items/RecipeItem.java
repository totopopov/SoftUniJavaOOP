package hell.entities.items;

import hell.interfaces.Recipe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 17:52.
 */
public class RecipeItem extends BaseItem implements Recipe{

    private List<String> requiredItems;

    public RecipeItem(String name, int strenghtBonus, int agilityBonus, int inteligenceBonus, int hitPointsBonus, int damageBonus, String... itemsRequired) {
        super(name, strenghtBonus, agilityBonus, inteligenceBonus, hitPointsBonus, damageBonus);
        this.requiredItems=Arrays.asList(itemsRequired);
    }

    @Override
    public List<String> getRequiredItems() {
        return Collections.unmodifiableList(this.requiredItems);
    }
}
