package DefineAnInterfaceIPerson;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 18:44.
 */
public class Citizen implements Person{
    private String name;
    private int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
