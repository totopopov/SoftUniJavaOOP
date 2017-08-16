package warningLevelsProblem;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:25.
 */
public class Message {
    private Importance importance;
    private String message;


    public Message(String importance, String message) {
        this.importance = Importance.valueOf(importance);
        this.message = message;
    }

    public Importance getImportance() {
        return this.importance;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",this.getImportance(), this.message);
    }
}
