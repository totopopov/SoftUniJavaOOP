package kingsGambitSecond.models;

import kingsGambitSecond.contracts.Atackable;
import kingsGambitSecond.contracts.Killable;

public abstract class Soldier implements Atackable, Killable {

    private String name;
    private boolean isDead;

    protected Soldier(String name) {
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public void kill() {
        this.isDead = true;
    }
}
