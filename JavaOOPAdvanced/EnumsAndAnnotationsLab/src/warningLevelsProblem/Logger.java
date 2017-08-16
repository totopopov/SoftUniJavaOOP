package warningLevelsProblem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:27.
 */
public class Logger implements LoggerAble {
    private Importance importance;
    private List<Message> logs;

    public Logger(String importance) {
        this.importance = Importance.valueOf(importance);
        this.logs = new ArrayList<>();
    }


    @Override
    public void addNewLog(Message message) {
        if (message.getImportance().compareTo(this.importance)>=0){
            this.logs.add(message);
        }
    }

    @Override
    public Iterable<Message> getMessages() {
        return this.logs;
    }
}
