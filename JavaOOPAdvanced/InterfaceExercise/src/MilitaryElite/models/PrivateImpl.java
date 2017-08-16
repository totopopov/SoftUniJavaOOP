package MilitaryElite.models;

import MilitaryElite.Interfaces.Private;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 15:58.
 */
public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName,double salary) {
        super(id, firstName, lastName);
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {

        return String.format("%s Salary: %.2f",
                super.toString(),this.getSalary());
    }
}
