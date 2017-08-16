package hell.core.Cmd;

import hell.core.DataHandlerAble;
import hell.core.annotation.InjectParams;
import hell.entities.miscellaneous.HeroInventory;
import hell.interfaces.Hero;
import hell.interfaces.Inventory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 17:22.
 */
public class HeroCommand extends BaseCommand {

    @InjectParams
    private String[] params;

    public HeroCommand(DataHandlerAble dataHandle) {
        super(dataHandle);
    }


    @Override
    public String execute() {

        String heroName=params[1];
        String type=params[2];
        Hero hero=null;
        Class<Hero> heroClass = null;
        try {
            heroClass = (Class<Hero>) Class.forName("hell.entities.heroes." +type  + "Hero");
            Constructor<Hero> declaredConstructor = heroClass.getDeclaredConstructor(String.class, Inventory.class);
            declaredConstructor.setAccessible(true);
            Inventory heroInventory=new HeroInventory();
            hero = declaredConstructor.newInstance(heroName, heroInventory);


        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
        super.getDataHandle().addHero(hero);

        return String.format("Created %s - %s",type,heroName);
    }
}
