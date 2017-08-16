package MilitaryElite.models;

import MilitaryElite.Interfaces.SpecialisedSoldier;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 16:15.
 */
public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private String corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary,String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {

        if (corps.equals("Airforces") || corps.equals("Marines")){
            this.corps = corps;
        }else {
            throw new IllegalArgumentException("Bad input");
        }

    }

    @Override
    public String getCorps() {
        return this.corps;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator());
        sb.append(String.format("Corps: %s",this.getCorps()));
        return sb.toString();
    }
}
