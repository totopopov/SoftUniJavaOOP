package RawData;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 4:07.
 */
public class Cargo {
    private int weight;
    private String type;

    public Cargo(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    protected int getWeight() {
        return weight;
    }

    protected String getType() {
        return type;
    }
}
