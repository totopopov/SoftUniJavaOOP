package kingsGambitSecond.commands;

import kingsGambitSecond.commands.Command;
import kingsGambitSecond.contracts.AttackableGroup;

public class Kill extends Command {

    public Kill(String[] data, AttackableGroup attackableGroup) {
        super(attackableGroup);
        super.setData(data);
    }

    @Override
    public void execute() {
        String name = super.getData()[1];
        super.getAttackableGroup().removeMember(name);
    }
}
