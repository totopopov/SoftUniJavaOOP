package coffeMachineProblem;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:45.
 */
public enum  CoffeeSize {

    SMALL(50,50), NORMAL(100,75), DOUBLE(200,100);

    private int volume;
    private int price;

    CoffeeSize(int volume, int price) {
        this.volume = volume;
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }
}
