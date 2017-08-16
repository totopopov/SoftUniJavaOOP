package dungensAndDragons.mediators;

import dungensAndDragons.models.Attacker;
import dungensAndDragons.models.ObservableTarget;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 17:30.
 */
public class Group implements AttackGroup {
    private Set<Attacker> attackers;

    public Group() {
        attackers=new LinkedHashSet<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        attackers.add(attacker);
    }

    @Override
    public void groupTarget(ObservableTarget target) {
        for (Attacker attacker : attackers) {
            attacker.setTarget(target);
        }
    }

    @Override
    public void groupAttack() {
        for (Attacker attacker : attackers) {
            attacker.attack();
        }
    }

    @Override
    public void groupTargetAndAttack(ObservableTarget target) {
        this.groupTarget(target);
        this.groupAttack();
    }
}
