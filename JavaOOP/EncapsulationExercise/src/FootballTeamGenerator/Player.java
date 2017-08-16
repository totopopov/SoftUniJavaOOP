package FootballTeamGenerator;

/**
 * Created by Todor Popov using Lenovo on 27.2.2017 г. at 19:04.
 */
public class Player extends Name{

   private int endurance;
   private int sprint;
   private int dribble;
   private int passing;
   private int shooting;


    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        super(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }


    private int getEndurance() {
        return this.endurance;
    }

    private void setEndurance(int endurance) {
        Checker(endurance,"Endurance");
        this.endurance = endurance;
    }

    private int getSprint() {
        return this.sprint;
    }

    private void setSprint(int sprint) {
        Checker(endurance,"Sprint");
        this.sprint = sprint;
    }

    private int getDribble() {
        return this.dribble;
    }

    private void setDribble(int dribble) {
        Checker(endurance,"Dribble");
        this.dribble = dribble;
    }

    private int getPassing() {
        return this.passing;
    }

    private void setPassing(int passing) {
        Checker(endurance,"Passing");
        this.passing = passing;
    }

    public int getShooting() {
        return this.shooting;
    }

    public void setShooting(int shooting) {
        Checker(endurance,"Shooting");
        this.shooting = shooting;
    }

    public double calculateAverageStats(){
        double sum=this.getDribble()+this.getEndurance()+this.getPassing()+this.getShooting()+this.getSprint();
        return sum/5;
    }

    private void Checker(int value, String stat) {
        if (value<0 || value>100){
            throw new IllegalArgumentException(stat + " should be between 0 and 100.");
        }
    }


}
