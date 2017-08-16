package MilitaryElite.models;

import MilitaryElite.Interfaces.Spy;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 16:50.
 */
public class SpyImpl extends SoldierImpl implements Spy {
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName,int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber=codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return super.toString()+System.lineSeparator()+String.format("Code Number: %d",this.getCodeNumber());
    }
}
