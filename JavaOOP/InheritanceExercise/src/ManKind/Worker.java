package ManKind;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 20:53.
 */
public class Worker extends Human{

   private double woekSalary;
   private double workingHours;

    public Worker(String firstName, String lastName, double workingSalary, double workingHours) {
        super(firstName, lastName);
        this.setWoekSalary(workingSalary);
        this.setWorkingHours(workingHours);
    }

    public double getWoekSalary() {
        return this.woekSalary;
    }

    private void setWoekSalary(double woekSalary) {
        if (woekSalary <10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.woekSalary = woekSalary;
    }

    public double getWorkingHours() {
        return this.workingHours;
    }

    private void setWorkingHours(double workingHours) {
        if (workingHours<1 || workingHours>12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workingHours = workingHours;
    }

    public double getHourlyWage(){
        return this.getWoekSalary()/(this.workingHours*7);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append(String.format("Week Salary: %.2f",this.getWoekSalary()))
                .append(System.lineSeparator()).append(String.format("Hours per day: %.2f",getWorkingHours()))
                .append(System.lineSeparator()).append(String.format("Salary per hour: %.2f",this.getHourlyWage()));

        return sb.toString();
    }
}
