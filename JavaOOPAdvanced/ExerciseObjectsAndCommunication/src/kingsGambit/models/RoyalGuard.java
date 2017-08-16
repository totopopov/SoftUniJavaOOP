package kingsGambit.models;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 20:36.
 */
public class RoyalGuard extends BaseUnit {
    public RoyalGuard(String name) {
        super(name);
    }

    @Override
    public String responce() {
        return String.format("Royal Guard %s is defending!",this.getName());
    }
}
