package pr0304Barracks.models.units;

/**
 * Created by Todor Popov using Lenovo on 2.4.2017 г. at 18:08.
 */
public class Gunner extends AbstractUnit {

    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}
