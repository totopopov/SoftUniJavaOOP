package kingsGambit.models;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 20:36.
 */
public class Footman extends BaseUnit {
    public Footman(String name) {
        super(name);
    }

    @Override
    public String responce() {
        return String.format("Footman %s is panicking!",this.getName());
    }
}
