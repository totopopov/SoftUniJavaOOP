package DefineClassPerson;

/**
 * Created by Todor Popov using Lenovo on 22.2.2017 г. at 19:20.
 */
public class Person {
    protected String name;
    protected int age;


    public Person() {
        this(1);
    }

    public Person(int age) {
        this("No name", age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
