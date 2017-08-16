package coffeMachineProblem;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:40.
 */
public interface CoffeeMachineAble {
    void buyCoffee(String size, String type);

    void insertCoin(String coin);

    Iterable<Coffee> coffeesSold();


}
