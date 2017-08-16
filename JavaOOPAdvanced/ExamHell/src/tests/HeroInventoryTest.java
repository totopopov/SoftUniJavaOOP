package tests;

import hell.entities.miscellaneous.HeroInventory;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


public class HeroInventoryTest {

    private Inventory inventory;
    private Item itemWithLongBonuses;
    private Recipe simpleRecipy;


    @Before
    public void setUp() throws Exception {

        this.inventory=new HeroInventory();
        Item item = Mockito.mock(Item.class);
        this.itemWithLongBonuses = Mockito.mock(Item.class);
        Mockito.when(item.getName()).thenReturn("SmallNeedlessItem");
        Mockito.when(item.getAgilityBonus()).thenReturn(22);
        Mockito.when(item.getDamageBonus()).thenReturn(22);
        Mockito.when(item.getHitPointsBonus()).thenReturn(22);
        Mockito.when(item.getIntelligenceBonus()).thenReturn(22);
        Mockito.when(item.getStrengthBonus()).thenReturn(22);
        this.inventory.addCommonItem(item);

        Mockito.when(this.itemWithLongBonuses.getName()).thenReturn("RarePunchEverybodyItem");
        Mockito.when(this.itemWithLongBonuses.getAgilityBonus()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(this.itemWithLongBonuses.getDamageBonus()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(this.itemWithLongBonuses.getHitPointsBonus()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(this.itemWithLongBonuses.getIntelligenceBonus()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(this.itemWithLongBonuses.getStrengthBonus()).thenReturn(Integer.MAX_VALUE);

       this.simpleRecipy=Mockito.mock(Recipe.class);
       Mockito.when(this.simpleRecipy.getName()).thenReturn("Recipy");
       List<String> requirements=new ArrayList<>();
       requirements.add("SmallNeedlessItem");
       Mockito.when(this.simpleRecipy.getRequiredItems()).thenReturn(requirements);
       Mockito.when(this.simpleRecipy.getAgilityBonus()).thenReturn(10);
       Mockito.when(this.simpleRecipy.getDamageBonus()).thenReturn(10);
       Mockito.when(this.simpleRecipy.getHitPointsBonus()).thenReturn(10);
       Mockito.when(this.simpleRecipy.getIntelligenceBonus()).thenReturn(10);
       Mockito.when(this.simpleRecipy.getStrengthBonus()).thenReturn(10);
    }

    @Test
    public void getTotalBonuses() throws Exception {
        Assert.assertEquals("Returning wrong Agility",inventory.getTotalAgilityBonus(),22);
        Assert.assertEquals("Returning wrong Damage",inventory.getTotalDamageBonus(),22);
        Assert.assertEquals("Returning wrong HitPoints",inventory.getTotalHitPointsBonus(),22);
        Assert.assertEquals("Returning wrong Intelligence",inventory.getTotalIntelligenceBonus(),22);
        Assert.assertEquals("Returning wrong Strength",inventory.getTotalStrengthBonus(),22);
    }

    @Test
    public void getTotalLongBonuses() throws Exception {
        this.inventory.addCommonItem(this.itemWithLongBonuses);
        Assert.assertEquals("Returning wrong Agility",inventory.getTotalAgilityBonus(),(long) Integer.MAX_VALUE+22);
        Assert.assertEquals("Returning wrong Damage",inventory.getTotalDamageBonus(),(long) Integer.MAX_VALUE+22);
        Assert.assertEquals("Returning wrong HitPoints",inventory.getTotalHitPointsBonus(),(long) Integer.MAX_VALUE+22);
        Assert.assertEquals("Returning wrong Intelligence",inventory.getTotalIntelligenceBonus(),(long) Integer.MAX_VALUE+22);
        Assert.assertEquals("Returning wrong Strength",inventory.getTotalStrengthBonus(),(long) Integer.MAX_VALUE+22);
    }

   @Test
   public void getTotalBonusesWithRecipy() throws Exception {
       this.inventory.addRecipeItem(this.simpleRecipy);
       Assert.assertEquals("Returning wrong Agility",inventory.getTotalAgilityBonus(),10);
       Assert.assertEquals("Returning wrong Damage",inventory.getTotalDamageBonus(),10);
       Assert.assertEquals("Returning wrong HitPoints",inventory.getTotalHitPointsBonus(),10);
       Assert.assertEquals("Returning wrong Intelligence",inventory.getTotalIntelligenceBonus(),10);
       Assert.assertEquals("Returning wrong Strength",inventory.getTotalStrengthBonus(),10);
   }






}
