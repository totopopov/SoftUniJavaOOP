package ValidationData;

/**
 * Created by Todor Popov using Lenovo on 23.2.2017 г. at 15:25.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        } else {
            this.lastName = lastName;
        }
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        } else {
            this.age = age;
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        } else {
            this.salary = salary;
        }
    }

    public void increaseSalary(int bonus) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + this.getSalary() * (bonus / 200d));
        } else {
            this.setSalary(this.getSalary() + this.getSalary() * (bonus / 100d));
        }
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.lastName + " get " + this.getSalary() + " leva";
    }
}
