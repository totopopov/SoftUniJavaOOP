package SayHelloExtended;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 20:06.
 */
public class Chinese extends BasePerson implements Person{

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
