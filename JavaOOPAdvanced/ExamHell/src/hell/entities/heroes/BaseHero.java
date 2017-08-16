package hell.entities.heroes;

import hell.entities.miscellaneous.ItemCollection;
import hell.interfaces.Hero;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Created by Todor Popov using Lenovo on 23.4.2017 г. at 15:39.
 */
public abstract class BaseHero implements Hero {
    private String name;
    private long strength;
    private long agility;
    private long intelligence;
    private long hitPoints;
    private long damage;
    private Inventory inventory;

    protected BaseHero(String name, long strength, long agility, long intelligence, long hitPoints, long damage, Inventory inventory) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.inventory = inventory;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getStrength() {
        return this.strength + this.inventory.getTotalStrengthBonus();
    }

    @Override
    public long getAgility() {
        return this.agility + this.inventory.getTotalAgilityBonus();
    }

    @Override
    public long getIntelligence() {
        return this.intelligence+this.inventory.getTotalIntelligenceBonus();
    }

    @Override
    public long getHitPoints() {
        return this.hitPoints+this.inventory.getTotalHitPointsBonus();
    }

    @Override
    public long getDamage() {
        return this.damage + this.inventory.getTotalDamageBonus();
    }

    @Override
    public Collection<Item> getItems() {

        Collection<Item> collection=new LinkedList<>();

        String fieldName=null;
        Map<String, Item> commonItems=new LinkedHashMap<>();
        Class<? extends Inventory> inventoryClass = this.inventory.getClass();
        Field[] declaredFields = inventoryClass.getDeclaredFields();
        Class<? extends Field> fieldClass=null;
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(ItemCollection.class)){
                fieldName=declaredField.getName();
                break;
            }
        }
        if (fieldName!=null){
            try {
                Field declaredField = inventoryClass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
               commonItems= (Map<String, Item>) declaredField.get(this.inventory);

            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return commonItems.values();
    }

    @Override
    public void addItem(Item item) {
        this.inventory.addCommonItem(item);
    }

    @Override
    public void addRecipe(Recipe recipe) {
        this.inventory.addRecipeItem(recipe);
    }
}
