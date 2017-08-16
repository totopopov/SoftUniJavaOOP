package CompanyRoster;

/**
 * Created by Todor Popov using Lenovo on 22.2.2017 г. at 19:47.
 */
public class Employee {


    private String name;
    private Double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public Employee(String name, Double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email="n/a";
        this.age=-1;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %s",this.name, this.salary, this.email, this.age);
    }
}
