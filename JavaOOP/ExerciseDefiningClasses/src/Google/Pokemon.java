package Google;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 0:07.
 */
public class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name +" "+this.type+System.lineSeparator();
    }
}
