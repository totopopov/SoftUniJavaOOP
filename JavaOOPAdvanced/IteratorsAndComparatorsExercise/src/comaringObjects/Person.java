package comaringObjects;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 0:05.
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person otherPerson) {
       int output= this.getName().compareTo(otherPerson.getName());

       if (output==0){
           output=Integer.compare(this.getAge(),otherPerson.getAge());
       }

       if (output==0){
          output=this.getTown().compareTo(otherPerson.getTown());
       }

        return output;
    }
}
