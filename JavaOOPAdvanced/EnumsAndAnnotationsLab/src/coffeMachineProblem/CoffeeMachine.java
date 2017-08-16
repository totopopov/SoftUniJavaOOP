package coffeMachineProblem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:43.
 */
public class CoffeeMachine implements CoffeeMachineAble {
    private List<Coin> coins;
    private List<Coffee> coffees;
    private List<String> comments;

    public CoffeeMachine() {
        this.coins = new ArrayList<>();
        this.coffees = new ArrayList<>();
    }

    private int getCurrentCoins() {
        return this.coins.stream().mapToInt(c->c.getValue()).sum();
    }

    @Override
    public void buyCoffee(String size, String type) {
        Coffee coffee= new Coffee(size,type);
        int currentCoings= getCurrentCoins();
        if (currentCoings >=coffee.getSize().getPrice()){
            this.coffees.add(coffee);
            this.coins.clear();
        }
    }

    @Override
    public void insertCoin(String coin) {
        this.coins.add(Coin.valueOf(coin));
    }

    @Override
    public Iterable<Coffee> coffeesSold() {
        return this.coffees;
    }
}
