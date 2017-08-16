package MultipleImplementation;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 18:44.
 */
public class Citizen implements Person,Identifiable,Birthable {
    private String name;
    private int age;
    private String id;
    private String birthday;

    public Citizen(String name, int age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthdate() {
        return this.birthday;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
