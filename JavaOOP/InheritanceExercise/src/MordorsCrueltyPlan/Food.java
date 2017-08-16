package MordorsCrueltyPlan;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 0:41.
 */
public class Food {
    private String name;
    private int points;

    public Food(String name) {
        this.setName(name);
        this.setPoints(calculatePoints());
    }

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return this.points;
    }

    private void setPoints(int points) {
        this.points = points;
    }

    private int calculatePoints() {
        switch (this.getName()) {
            case "cram":
                return 2;
            case "lembas":
                return 3;
            case "apple":
            case "melon":
                return 1;
            case "honeycake":
                return 5;
            case "mushrooms":
                return -10;
            default:
                return -1;
        }
    }

}
