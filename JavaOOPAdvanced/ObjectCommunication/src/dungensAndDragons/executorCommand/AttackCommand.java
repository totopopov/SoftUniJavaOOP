package dungensAndDragons.executorCommand;

import dungensAndDragons.models.Attacker;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 17:12.
 */
public class AttackCommand implements Command {

    private Attacker attacker;

    public AttackCommand(Attacker attacker) {
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        this.attacker.attack();
    }
}
