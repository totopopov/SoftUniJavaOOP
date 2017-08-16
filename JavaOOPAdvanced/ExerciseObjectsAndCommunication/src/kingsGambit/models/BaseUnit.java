package kingsGambit.models;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 20:36.
 */
public abstract class BaseUnit implements Comparable<BaseUnit>{
    private String name;

    public BaseUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public abstract String responce();

    @Override
    public int compareTo(BaseUnit o) {
        return this.getName().compareTo(o.getName());
    }


}
