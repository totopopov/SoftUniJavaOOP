package MilitaryElite.models;

import MilitaryElite.Interfaces.Repair;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 16:28.
 */
public class RepairImpl implements Repair {
    private String name;
    private int hours;

    public RepairImpl(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHours() {
        return this.hours;
    }

    @Override
    public String toString() {
        return String.format("  Part Name: %s Hours Worked: %d",this.getName(),this.getHours());
    }
}
