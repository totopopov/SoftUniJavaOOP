package kingsGambitSecond.contracts;

public interface AttackableGroup {

    void addMember(Atackable atackable);
    void groupTakeAttack();
    void removeMember(String atackableName);

}
