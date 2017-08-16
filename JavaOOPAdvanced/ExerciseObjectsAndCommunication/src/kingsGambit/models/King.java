package kingsGambit.models;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 20:35.
 */
public class King extends BaseUnit {
    public King(String name) {
        super(name);
    }

    @Override
    public String responce() {
        return String.format("King %s is under attack!",super.getName());
    }
}
