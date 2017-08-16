package dungensAndDragons;

import dungensAndDragons.executorCommand.*;
import dungensAndDragons.loggers.*;
import dungensAndDragons.mediators.AttackGroup;
import dungensAndDragons.mediators.Group;
import dungensAndDragons.models.*;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 15:46.
 */
public class Main {
    public static void main(String[] args) {
        Logger combatLogger= new CombatLogger();
        Logger errorLogger = new ErrorLogger();
        Logger eventLogger=new EventLogger();


        combatLogger.setSuccessor(errorLogger);
        errorLogger.setSuccessor(eventLogger);

        AttackGroup group = new Group();
        Attacker warrior =new Warrior("Warrior",10,combatLogger);
        Attacker ninjaWarrior =new Warrior("NinjaGO",20,combatLogger);
        group.addMember(warrior);
        group.addMember(ninjaWarrior);

        ObservableTarget dragon =new Dragon("Dragon",30,25,combatLogger);

        Executor executor =new CommandExecutor();
        Command target = new GroupTargetCommand(group,dragon);
        Command attack=new GroupAttackCommand(group);
        executor.executeCommand(target);
        executor.executeCommand(attack);

    }
}
