package hell.core.Cmd;

import hell.core.DataHandlerAble;
import hell.core.annotation.InjectParams;
import hell.entities.items.RecipeItem;
import hell.interfaces.Hero;
import hell.interfaces.Recipe;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 17:47.
 */
public class RecipeCommand extends BaseCommand {

    @InjectParams
    private String[] params;

    protected RecipeCommand(DataHandlerAble dataHandle) {
        super(dataHandle);
    }

    @Override
    public String execute() {
        String recipyName = params[1];
        String heroName = params[2];

        int strenghtBonus = Integer.parseInt(params[3]);
        int agilityBonus = Integer.parseInt(params[4]);
        int inteligenceBonus = Integer.parseInt(params[5]);
        int hitPointsBonus = Integer.parseInt(params[6]);
        int damageBonus = Integer.parseInt(params[7]);
        String[] requrements=new String[params.length-8];

        System.arraycopy(params, 8, requrements, 0, params.length - 8);

        Recipe recipe=new RecipeItem(recipyName,strenghtBonus,agilityBonus,inteligenceBonus,hitPointsBonus,damageBonus,requrements);
        Hero theHero = super.getDataHandle().getHeroe(heroName);
        theHero.addRecipe(recipe);

        return String.format("Added recipe - %s to Hero - %s",recipyName,heroName);
    }
}
