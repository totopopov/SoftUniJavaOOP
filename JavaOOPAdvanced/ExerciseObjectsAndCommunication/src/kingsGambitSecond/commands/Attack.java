package kingsGambitSecond.commands;

import kingsGambitSecond.commands.Command;
import kingsGambitSecond.contracts.AttackableGroup;

public class Attack extends Command {

    public Attack(AttackableGroup attackableGroup) {
        super(attackableGroup);
    }

    @Override
    public void execute() {
        super.getAttackableGroup().groupTakeAttack();
    }
}
