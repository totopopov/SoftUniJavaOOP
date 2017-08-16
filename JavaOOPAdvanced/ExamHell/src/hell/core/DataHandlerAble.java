package hell.core;

import hell.interfaces.Hero;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 17:05.
 */
public interface DataHandlerAble  {
    Hero getHeroe(String name);

    void addHero(Hero hero);

    Iterable<Hero> getHeroCollection();
}
