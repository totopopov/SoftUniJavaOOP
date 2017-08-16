package rpgTests;

import models.Hero;
import models.Target;
import models.Weapon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Todor Popov using Lenovo on 3.4.2017 г. at 2:27.
 */
public class HeroTests {

    private static final int DUMMY_XP_TO_GOVE_WHEN_DIES = 10;
    private static final boolean TRAGET_DEAD_TRUE = true;
    private static final int EXPECTED_XP_FROM_DUMMY = 10;
    public static final int EXPECTED_XP_FROM_2_TARGETS = 20;

    private Target mockTarget;
    private Weapon mockWeapon;
    private Hero hero;

    @Before
    public void initializeObjects(){
         this.mockTarget = Mockito.mock(Target.class);
         this.mockWeapon = Mockito.mock(Weapon.class);
        Mockito.when(mockTarget.giveExperience()).thenReturn(DUMMY_XP_TO_GOVE_WHEN_DIES);
        Mockito.when(mockTarget.isDead()).thenReturn(TRAGET_DEAD_TRUE);
        this.hero= new Hero("Hitman#47",mockWeapon);
    }

    @Test
    public void giveExpectedXPWhenHeroKillsTarget(){
        this.hero.attack(this.mockTarget);
        Assert.assertEquals("Not the right XP given from target",this.hero.getExperience(), EXPECTED_XP_FROM_DUMMY);
    }

    @Test
    public void giveExpectedXPWhenHeroKillsTwoTargets(){
        this.hero.attack(this.mockTarget);
        this.hero.attack(this.mockTarget);
        Assert.assertEquals("Not the right XP given from target",this.hero.getExperience(), EXPECTED_XP_FROM_2_TARGETS);
    }
}
