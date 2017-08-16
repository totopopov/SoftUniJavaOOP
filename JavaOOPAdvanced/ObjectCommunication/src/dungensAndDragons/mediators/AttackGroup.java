package dungensAndDragons.mediators;

import dungensAndDragons.models.Attacker;
import dungensAndDragons.models.ObservableTarget;


/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 17:27.
 */
public interface AttackGroup {

    void addMember(Attacker attacker);

    void groupTarget(ObservableTarget target);

    void groupAttack();

    void groupTargetAndAttack(ObservableTarget target);
}
