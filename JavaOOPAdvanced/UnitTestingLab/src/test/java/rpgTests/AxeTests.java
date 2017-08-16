package rpgTests;

import models.Axe;
import models.Dummy;
import models.Target;
import models.Weapon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Todor Popov using Lenovo on 30.3.2017 г. at 15:19.
 */
public class AxeTests {

    private static final int INITIAL_DUMMY_HEALTH = 10;
    private static final int INITIAL_DUMMY_XP = 10;
    private static final int EXPECTED_DURABILITY = 9;
    private static final int INITIAL_WEAPON_ATTACK = 10;
    private static final int INITIAL_WEAPON_DURABILITY = 0;

    private Weapon axe;
    private Target dummy;

    @Before
    public void initializeTestObjects() {
        this.axe = new Axe(INITIAL_WEAPON_ATTACK, INITIAL_WEAPON_DURABILITY);
        this.dummy=new Dummy(INITIAL_DUMMY_HEALTH,INITIAL_DUMMY_XP);
    }

    @Test
    public void testingAxeToLoseDurabilityWhenAttack(){
        this.axe.attack(this.dummy);
        Assert.assertEquals("Durability not lost",this.axe.getDurabilityPoints(), EXPECTED_DURABILITY);
    }

    @Test(expected = IllegalStateException.class)
    public void testingAxeToThroughWhenAttackAndBroken(){
        this.axe.attack(this.dummy);
    }



}
