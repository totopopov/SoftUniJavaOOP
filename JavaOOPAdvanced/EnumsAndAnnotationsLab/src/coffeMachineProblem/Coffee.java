package coffeMachineProblem;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:40.
 */
public class Coffee {
    private CoffeeSize size;
    private CoffeeType type;

    public Coffee(String size, String type) {
        this.size = CoffeeSize.valueOf(size);
        this.type = CoffeeType.valueOf(type);
    }

    public CoffeeSize getSize() {
        return size;
    }

    public CoffeeType getType() {
        return type;
    }

    @Override
    public String toString() {
        String size=this.getSize().toString();
        String type = this.getType().toString();
        return size.charAt(0)+size.toLowerCase().substring(1)+ " "+type.charAt(0)+type.toLowerCase().substring(1);
    }
}
