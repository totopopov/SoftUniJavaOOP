package infernoInfinity.weapons;

import infernoInfinity.Gem;

/**
 * Created by Todor Popov using Lenovo on 27.3.2017 г. at 20:44.
 */
public interface WeaponAble extends Comparable<WeaponAble>{

    String getName();

    int getMinDamage();

    int getMaxDamage();

    void addGems(Gem gem, int socket);

    void removeGems(int socket);

    String comparedString();

    double getWeaponStatsSum();
}
