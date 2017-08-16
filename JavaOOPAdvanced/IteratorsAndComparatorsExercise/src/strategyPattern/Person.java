package strategyPattern;

import java.util.Comparator;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 0:53.
 */
public class Person implements Comparator<Person> , Comparable<Person>{
    private String name;
    private int age;

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


    @Override
    public String toString() {
        return this.getName()+" "+this.getAge();
    }


    @Override
    public int compare(Person p1, Person p2) {
        int compareTo = p1.getName().compareTo(p2.getName());

        return compareTo==0?p1.getAge()-p2.getAge():compareTo;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int compareTo = this.getName().compareTo(otherPerson.getName());

        return compareTo==0?this.getAge()-otherPerson.getAge():compareTo;
    }

    @Override
    public boolean equals(Object otherPerson) {
        if (this == otherPerson) return true;
        if (otherPerson == null || getClass() != otherPerson.getClass()) return false;

        Person person = (Person) otherPerson;

        if (this.age != person.age) return false;
        return this.name != null ? this.name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
