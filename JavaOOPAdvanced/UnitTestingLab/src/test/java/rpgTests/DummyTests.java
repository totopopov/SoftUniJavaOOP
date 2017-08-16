package rpgTests;

import models.Dummy;
import models.Target;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.management.ThreadInfo;

/**
 * Created by Todor Popov using Lenovo on 30.3.2017 г. at 15:26.
 */
public class DummyTests {

    private static final int DUMMY_INITIAL_HEALTH = 10;
    private static final int DUMMY_EXPERIENCE = 10;
    private static final int WEAPON_ATTACK_POINTS = 5;
    private static final int EXPECTED_HEALTH = 5;
    private static final int DUMMY_EXPECTED_XP = 10;

    private Target dummy;

    @Before
    public void initializeDummy(){
        this.dummy=new Dummy(DUMMY_INITIAL_HEALTH, DUMMY_EXPERIENCE);
    }


    @Test
    public void testDummyLosesHealthWhenAttacked(){
        this.dummy.takeAttack(WEAPON_ATTACK_POINTS);
        Assert.assertEquals("Health not lost after attack",this.dummy.getHealth(), EXPECTED_HEALTH);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyToThroughExceptionWhenAttacked(){
        this.dummy.takeAttack(WEAPON_ATTACK_POINTS);
        this.dummy.takeAttack(WEAPON_ATTACK_POINTS);
        this.dummy.takeAttack(WEAPON_ATTACK_POINTS);
    }

    @Test
    public void testDummyToGiveXPWhenAttackedAndDead(){
        this.dummy.takeAttack(WEAPON_ATTACK_POINTS);
        this.dummy.takeAttack(WEAPON_ATTACK_POINTS);
        Assert.assertEquals("Given experience not behave as expected",this.dummy.giveExperience(), DUMMY_EXPECTED_XP);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyToThroughExceptionWhenAliveAndAskedToGiveXP(){
        this.dummy.giveExperience();
    }

}
