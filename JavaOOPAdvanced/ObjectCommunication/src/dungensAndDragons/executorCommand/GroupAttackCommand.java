package dungensAndDragons.executorCommand;

import dungensAndDragons.mediators.AttackGroup;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 17:33.
 */
public class GroupAttackCommand implements Command {
    private AttackGroup attackGroup;

    public GroupAttackCommand(AttackGroup attackGroup) {
        this.attackGroup = attackGroup;
    }

    @Override
    public void execute() {
        this.attackGroup.groupAttack();
    }
}
