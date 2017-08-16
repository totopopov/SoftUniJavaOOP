package MilitaryElite.models;

import MilitaryElite.Interfaces.Repair;
import MilitaryElite.Interfaces.SpecialisedSoldier;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 16:21.
 */
public class EngineerImpl extends SpecialisedSoldierImpl implements MilitaryElite.Interfaces.Engineer {

    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs=new LinkedList<>();
    }


    @Override
    public void addPart(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(System.lineSeparator()).append("Repairs:").append(System.lineSeparator());
        repairs.forEach(p->sb.append(p.toString()).append(System.lineSeparator()));

        return sb.toString().trim();
    }
}
