package eventImplementation;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 19:15.
 */
public class NameChange extends Event{
    private String name;

    public NameChange(String name, Object source) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
