package SayHelloExtended;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 20:05.
 */
public class Bulgarian extends BasePerson implements Person{

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
