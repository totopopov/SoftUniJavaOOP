package models;

/**
 * Created by Todor Popov using Lenovo on 3.4.2017 г. at 2:28.
 */
public interface Weapon {
    int getAttackPoints();

    int getDurabilityPoints();

    void attack(Target target);
}
