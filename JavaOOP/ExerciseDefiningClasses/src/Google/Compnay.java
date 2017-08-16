package Google;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 0:06.
 */
public class Compnay {
   private String name;
   private String department;
   private double salary;

    public Compnay(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f%n",this.name,this.department,this.salary);
    }
}
