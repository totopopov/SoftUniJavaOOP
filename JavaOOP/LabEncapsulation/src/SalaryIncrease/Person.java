package SalaryIncrease;

/**
 * Created by Todor Popov using Lenovo on 23.2.2017 г. at 15:25.
 */
public class Person{
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Integer getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(int bonus) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + this.getSalary()* (bonus / 200d ));
        } else {
            this.setSalary(this.getSalary() + this.getSalary()* (bonus / 100d ));
        }
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.lastName + " get " + this.getSalary() + " leva";
    }
}
