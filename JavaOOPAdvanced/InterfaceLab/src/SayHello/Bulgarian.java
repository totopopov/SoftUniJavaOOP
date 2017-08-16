package SayHello;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 20:05.
 */
public class Bulgarian implements Person {
    private String name;

    public Bulgarian(String name) {
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
        return "Здравей";
    }
}
