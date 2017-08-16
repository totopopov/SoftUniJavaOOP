package infernoInfinity;

/**
 * Created by Todor Popov using Lenovo on 27.3.2017 г. at 18:20.
 */

@Information(author = "Todor",revision = 2,description = "Gem Enums",reviewers = "Katrin")
public enum BaseWeapon {
    AXE(5,10), SWORD(4,6), KNIFE(3,4);

    private int lowDamage;
    private int highDamage;

    BaseWeapon(int lowDamage, int highDamage) {
        this.lowDamage = lowDamage;
        this.highDamage = highDamage;
    }

    public int getLowDamage() {
        return this.lowDamage;
    }

    public int getHighDamage() {
        return this.highDamage;
    }
}
