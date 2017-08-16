package FoodShortage;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 20:22.
 */
public class Pet implements Birthable {
    private String name;
    private String birthday;

    public Pet(String name, String birthDay) {
        this.name = name;
        this.birthday = birthDay;
    }

    public String getName() {
        return name;
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
