package dungensAndDragons.executorCommand;

import dungensAndDragons.models.Attacker;
import dungensAndDragons.models.ObservableTarget;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 16:06.
 */
public class TargetCommand implements Command {

    private Attacker attacker;
    private ObservableTarget target;

    public TargetCommand(Attacker attacker, ObservableTarget target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        this.attacker.setTarget(this.target);
    }
}
