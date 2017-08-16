package kingsGambitSecond.commands;

import kingsGambitSecond.commands.Command;
import kingsGambitSecond.contracts.AttackableGroup;
import kingsGambitSecond.models.King;

public class AddKing extends Command {


    public AddKing(String[] data, AttackableGroup attackableGroup) {
        super(attackableGroup);
        super.setData(data);
    }

    @Override
    public void execute() {
        super.getAttackableGroup().addMember(new King(super.getData()[0]));
    }
}
