package kingsGambitSecond.models;

public class RoyalGuard extends Soldier {

    public RoyalGuard(String name) {
        super(name);
    }

    @Override
    public void respondToAttack() {
        System.out.println(String.format("Royal Guard %s is defending!", super.getName()));
    }
}
