package BorderControl;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 19:58.
 */
public class Robot implements Identifialble {
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean checkIDs(String lastIDnumber) {
        if (this.id.substring(this.id.length() - lastIDnumber.length()).equals(lastIDnumber)) {
            return true;
        }
        return false;
    }
}
