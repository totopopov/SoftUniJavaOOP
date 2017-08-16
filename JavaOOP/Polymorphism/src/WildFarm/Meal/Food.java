package WildFarm.Meal;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 1:21.
 */
public abstract class Food {
    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
