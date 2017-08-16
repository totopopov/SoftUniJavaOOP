package kingsGambit.models;
import java.util.*;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 20:38.
 */
public class Military implements MilitaryAble {
    private String name;
    private Set<BaseUnit> units;


    public Military(String name) {
        this.name = name;
        this.units =new LinkedHashSet<>();
    }

    @Override
    public Iterable<BaseUnit> getUnits(){
        return this.units;
    }

    @Override
    public void addUnit(BaseUnit unit){
        this.units.add(unit);
    }

    @Override
    public void removeUnit(BaseUnit unit){
        this.units.remove(unit);
    }


}
