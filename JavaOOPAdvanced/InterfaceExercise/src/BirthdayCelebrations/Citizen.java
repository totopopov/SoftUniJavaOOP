package BirthdayCelebrations;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 19:58.
 */
public class Citizen implements Identifialble,Birthable {
    private String name;
    private int age;
    private String id;
    private String birthday;

    public Citizen(String name, int age, String id,String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday=birthday;
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

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public boolean isBornInYear(String year) {
        return this.getBirthday().endsWith(year);
    }
}
