package Google;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 0:09.
 */
public class Relative extends Person {
    private String birthday;
    public Relative(String name,String birthday) {
        super(name);
        this.birthday=birthday;

    }

    @Override
    public String toString() {
        return this.getName() + " "+this.birthday+ System.lineSeparator();
    }
}
