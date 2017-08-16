package kingsGambit.commands.specificCommands;

import kingsGambit.models.MilitaryAble;
import kingsGambit.commands.Command;
import kingsGambit.models.BaseUnit;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 20:49.
 */
public class AttackKing implements Command {
    private MilitaryAble military;

    public AttackKing(MilitaryAble military) {
        this.military = military;
    }

    @Override
    public void execute() {

        Iterable<BaseUnit> units = this.military.getUnits();
        StringBuilder sbRoyals=new StringBuilder();
        StringBuilder sbFootMan=new StringBuilder();
        StringBuilder output=new StringBuilder();
        String kingSpeach="";
        for (BaseUnit unit : units) {
            if (unit.getClass().getSimpleName().equals("RoyalGuard")){
                sbRoyals.append(unit.responce()).append(System.lineSeparator());
            } else if (unit.getClass().getSimpleName().equals("Footman")){
                sbFootMan.append(unit.responce()).append(System.lineSeparator());;
            } else {
                kingSpeach=unit.responce();
            }
        }
        System.out.println(kingSpeach);
        output.append(sbRoyals.toString().trim()).append(System.lineSeparator());
        output.append(sbFootMan.toString().trim());
        System.out.println(output.toString().trim());
    }
}
