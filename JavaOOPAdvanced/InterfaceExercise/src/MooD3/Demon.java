package MooD3;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 0:36.
 */
public class Demon extends BaseCharachter implements DemonAble {
    private double energy;

    public Demon(String userName,  int level,double energy) {
        super(userName, level);
        this.energy=energy;
    }

    @Override
    public String getHashPassword() {
        return String.valueOf(super.getHashPassword().length()*217);
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public String toString() {
        StringBuilder sb =new StringBuilder();

        sb.append(String.format("\"%s\"",super.getUserName())).append(" | ").append(String.format("\"%s\"",this.getHashPassword()));
        sb.append(" -> ").append("Demon").append(System.lineSeparator()).append(super.getLevel()*this.getEnergy());

        return sb.toString().trim();
    }
}
