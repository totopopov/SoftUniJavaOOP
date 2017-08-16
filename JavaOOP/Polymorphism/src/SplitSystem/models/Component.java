package SplitSystem.models;

/**
 * Created by Todor Popov using Lenovo on 11.3.2017 г. at 16:10.
 */

public abstract class Component {
    private String name;
    private String type;


    public Component(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return  this.name;
    }

    public String getType() {
        return  this.type;
    }

    public abstract int getCapacity();
    public abstract int getMemory();

}
