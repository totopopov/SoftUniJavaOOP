package kingsGambit.commands.specificCommands;

import kingsGambit.models.BaseUnit;
import kingsGambit.models.MilitaryAble;
import kingsGambit.commands.Command;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 21:32.
 */
public class KillUnit implements Command {
    private MilitaryAble military;
    private String name;

    public KillUnit(MilitaryAble military, String name) {
        this.military = military;
        this.name=name;
    }

    @Override
    public void execute() {
        Iterable<BaseUnit> units = this.military.getUnits();
        BaseUnit unitToRemove=null;

        for (BaseUnit unit : units) {
            if (unit.getName().equals(this.name)){
               unitToRemove=unit;
            }
        };

        if (unitToRemove!=null){
            this.military.removeUnit(unitToRemove);
        }
    }
}
