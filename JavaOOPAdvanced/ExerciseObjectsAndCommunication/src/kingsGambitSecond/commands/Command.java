package kingsGambitSecond.commands;

import kingsGambitSecond.contracts.AttackableGroup;
import kingsGambitSecond.contracts.Executable;

public abstract class Command implements Executable {

    private AttackableGroup attackableGroup;
    private String[] data;

    protected Command(AttackableGroup attackableGroup) {
        this.attackableGroup = attackableGroup;
    }

    protected AttackableGroup getAttackableGroup() {
        return this.attackableGroup;
    }

    protected String[] getData() {
        return this.data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
