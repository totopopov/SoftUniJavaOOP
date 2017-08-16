package SortPersonsByNameAndAge;

/**
 * Created by Todor Popov using Lenovo on 23.2.2017 г. at 15:25.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Integer getAge() {
        return this.age;
    }


    @Override
    public String toString() {
        return this.getFirstName()+" "+this.lastName+" is a "+this.getAge()+" years old." ;
    }
}
