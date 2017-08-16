package pr0304Barracks.models.units;

/**
 * Created by Todor Popov using Lenovo on 2.4.2017 г. at 18:06.
 */
public class Horseman extends AbstractUnit {
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
