package BorderControl;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 19:58.
 */
public class Citizen implements Identifialble {
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean checkIDs(String lastIDnumber) {
        if (this.id.substring(this.id.length() - lastIDnumber.length()).equals(lastIDnumber)) {
            return true;
        }
        return false;
    }
}
