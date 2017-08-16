package dungensAndDragons.executorCommand;

import dungensAndDragons.mediators.AttackGroup;
import dungensAndDragons.models.ObservableTarget;
import dungensAndDragons.models.Target;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 17:34.
 */
public class GroupTargetCommand implements Command {
    private AttackGroup attackGroup;
    private ObservableTarget target;

    public GroupTargetCommand(AttackGroup attackGroup, ObservableTarget target) {
        this.attackGroup = attackGroup;
        this.target = target;
    }

    @Override
    public void execute() {
        this.attackGroup.groupTarget(this.target);
    }
}
