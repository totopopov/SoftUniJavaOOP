package SayHello;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 20:06.
 */
public class Chinese implements Person {
    private String name;
    public Chinese(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
