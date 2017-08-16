package kingsGambitSecond.commands;

import kingsGambitSecond.commands.*;
import kingsGambitSecond.contracts.AttackableGroup;
import kingsGambitSecond.models.RoyalGuard;

public class AddRoyalGuard extends Command {

    public AddRoyalGuard(String[] data, AttackableGroup attackableGroup) {
        super(attackableGroup);
        super.setData(data);
    }

    @Override
    public void execute() {
        for (String name : super.getData()) {
            super.getAttackableGroup().addMember(new RoyalGuard(name));
        }
    }
}
