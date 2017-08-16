package kingsGambitSecond.commands;

import kingsGambitSecond.commands.*;
import kingsGambitSecond.contracts.AttackableGroup;
import kingsGambitSecond.models.Footman;

public class AddFootmen extends Command {

    public AddFootmen(String[] data, AttackableGroup attackableGroup) {
        super(attackableGroup);
        super.setData(data);
    }

    @Override
    public void execute() {
        for (String name : super.getData()) {
            super.getAttackableGroup().addMember(new Footman(name));
        }
    }
}
