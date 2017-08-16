package kingsGambitSecond.models;

import kingsGambitSecond.contracts.Atackable;

public class King implements Atackable {

    private String name;

    public King(String name) {
        this.name = name;
    }

    @Override
    public void respondToAttack() {
        System.out.println(String.format("King %s is under attack!", this.name));
    }

    @Override
    public String getName() {
        return this.name;
    }
}
