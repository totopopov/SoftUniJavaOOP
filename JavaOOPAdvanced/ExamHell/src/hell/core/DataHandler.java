package hell.core;

import hell.interfaces.Hero;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 17:02.
 */
public class DataHandler implements DataHandlerAble {
    private final Map<String,Hero> heroes;

    public DataHandler() {
        this.heroes = new LinkedHashMap<>();
    }

    @Override
    public Hero getHeroe(String name) {
        return heroes.get(name);
    }

    @Override
    public void addHero(Hero hero){
        this.heroes.put(hero.getName(),hero);
    }

    @Override
    public Iterable<Hero> getHeroCollection(){

        return this.heroes.values().stream().sorted((h1, h2) -> {
            long hero1 = h1.getAgility() + h1.getIntelligence() + h1.getStrength();
            long hero2 = h2.getAgility() + h2.getIntelligence() + h2.getStrength();
            int returnValue=Long.compare(hero2, hero1);
            if (returnValue==0){
                 hero1 = h1.getHitPoints() + h1.getDamage();
                 hero2 = h2.getHitPoints() + h2.getDamage();
                 return Long.compare(hero2, hero1);
            }else {
                return returnValue;
            }
        }).collect(Collectors.toList());
    }


     private class CompareByPointsAndDamage implements Comparator<Hero>
    {
        @Override
        public int compare(Hero h1, Hero h2) {
            long hero1 = h1.getHitPoints() + h1.getDamage();
            long hero2 = h2.getHitPoints() + h2.getDamage();
            return Long.compare(hero2,hero1);
        }
    }

    private class CompareByStrAgtInt implements Comparator<Hero>
    {
        @Override
        public int compare(Hero h1, Hero h2) {
            long hero1 = h1.getAgility() + h1.getIntelligence()+h1.getStrength();
            long hero2 = h2.getAgility() + h2.getIntelligence()+h2.getStrength();
            return Long.compare(hero2,hero1);
        }
    }

}
