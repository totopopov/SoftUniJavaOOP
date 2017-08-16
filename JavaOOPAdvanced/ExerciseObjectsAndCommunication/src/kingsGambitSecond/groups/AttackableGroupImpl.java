package kingsGambitSecond.groups;

import kingsGambitSecond.contracts.Atackable;
import kingsGambitSecond.contracts.AttackableGroup;

import java.util.LinkedHashMap;
import java.util.Map;

public class AttackableGroupImpl implements AttackableGroup {

    private Map<String, Atackable> atackables;

    public AttackableGroupImpl() {
        this.atackables = new LinkedHashMap<>();
    }


    @Override
    public void addMember(Atackable atackable) {
        this.atackables.put(atackable.getName(), atackable);
    }

    @Override
    public void groupTakeAttack() {
        for (Atackable atackable : this.atackables.values()) {
            atackable.respondToAttack();
        }
    }

    @Override
    public void removeMember(String atackableName) {
        this.atackables.remove(atackableName);
    }
}
