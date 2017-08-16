package MilitaryElite.models;

import MilitaryElite.Interfaces.Soldier;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 15:54.
 */
public abstract class SoldierImpl implements Soldier{
    private int id;
    private String firstName;
    private String lastName;

    public SoldierImpl(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
