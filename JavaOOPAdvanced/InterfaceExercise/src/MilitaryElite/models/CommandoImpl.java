package MilitaryElite.models;

import MilitaryElite.Interfaces.Commando;
import MilitaryElite.Interfaces.Mission;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 16:32.
 */
public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions=new LinkedList<>();
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(System.lineSeparator()).append("Missions: ").append(System.lineSeparator());

        this.missions.
                forEach(m->sb.append(m.toString()).append(System.lineSeparator()));

        return sb.toString().trim();
    }
}
