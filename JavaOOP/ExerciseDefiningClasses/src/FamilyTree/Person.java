package FamilyTree;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 15:34.
 */
public class Person {
   private String name;
   private String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthday;
    }
}
