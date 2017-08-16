package infernoInfinity.weapons;

import infernoInfinity.BaseWeapon;
import infernoInfinity.Gem;
import infernoInfinity.Information;

import java.util.Arrays;

/**
 * Created by Todor Popov using Lenovo on 27.3.2017 г. at 18:13.
 */

@Information(author = "Pesho", revision = 3,
        description = "Used for Java OOP Advanced course - Enumerations and Annotations.",
        reviewers = {"Pesho", "Svetlio"})
public abstract class Weapon implements WeaponAble {
    private String name;
    private BaseWeapon weaponType;
    private Gem[] gems;
    private int minDamage;
    private int maxDamage;
    private int strength;
    private int agility;
    private int vitality;


    public Weapon(String name, BaseWeapon weaponType, int gemssNumber) {
        this.setName(name);
        this.weaponType = weaponType;
        this.gems = new Gem[gemssNumber];
        this.setMinDamage();
        this.setMaxDamage();
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMinDamage() {
        return this.minDamage;
    }

    private void setMinDamage() {
        this.minDamage = this.weaponType.getLowDamage();
    }

    @Override
    public int getMaxDamage() {
        return this.maxDamage;
    }

    private void setMaxDamage() {
        this.maxDamage =this.weaponType.getHighDamage();
    }

    @Override
    public void addGems(Gem gem, int socket){
        if (socket>=0 && socket<this.gems.length){
            this.gems[socket]=gem;
        }

        this.refreshStats();
    }

    @Override
    public void removeGems(int socket){
        if (socket>=0 && socket<this.gems.length){
            this.gems[socket]=null;
        }
        this.refreshStats();
    }

    private void refreshStats(){
     int minDamage=this.weaponType.getLowDamage();
     int maxDamage=this.weaponType.getHighDamage();
     int agility=0;
     int strength=0;
     int vitality=0;

        for (Gem gem : gems) {
            if (gem != null) {
                agility += gem.getAgility();
                vitality += gem.getVitality();
                strength += gem.getStrength();
            }
        }

        minDamage+=strength*2;
        minDamage+=agility;
        maxDamage+=strength*3;
        maxDamage+=agility*4;

        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
    }

    @Override
    public double getWeaponStatsSum(){
        double thisWeaponDamage=((double)this.getMaxDamage()+this.getMinDamage())/2;
        return thisWeaponDamage+this.strength+this.vitality+this.agility;
    }


    @Override
    public int compareTo(WeaponAble otherWeapon) {
        return Double.compare(this.getWeaponStatsSum(),otherWeapon.getWeaponStatsSum());
    }

    @Override
    public String toString() {
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality"
                ,this.getName(),this.getMinDamage(),this.getMaxDamage(),
                this.strength,this.agility,this.vitality);
    }

    public String comparedString() {
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality (Item Level: %.1f)"
                ,this.getName(),this.getMinDamage(),this.getMaxDamage(),
                this.strength,this.agility,this.vitality,this.getWeaponStatsSum());
    }

}
