package hell.core.Cmd;

import hell.core.DataHandlerAble;
import hell.core.annotation.InjectParams;
import hell.entities.items.CommonItem;
import hell.interfaces.Hero;
import hell.interfaces.Item;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 17:39.
 */
public class ItemCommand extends BaseCommand {
    @InjectParams
    private String[] params;

    protected ItemCommand(DataHandlerAble dataHandle) {
        super(dataHandle);
    }

    @Override
    public String execute() {
        String itemName = params[1];
        String heroName = params[2];

        int strenghtBonus = Integer.parseInt(params[3]);
        int agilityBonus = Integer.parseInt(params[4]);
        int inteligenceBonus = Integer.parseInt(params[5]);
        int hitPointsBonus = Integer.parseInt(params[6]);
        int damageBonus = Integer.parseInt(params[7]);

        Item item=new CommonItem(itemName,strenghtBonus,agilityBonus,inteligenceBonus,hitPointsBonus,damageBonus);
        Hero theHero = super.getDataHandle().getHeroe(heroName);
        theHero.addItem(item);

        return String.format("Added item - %s to Hero - %s",itemName,heroName);
    }
}
