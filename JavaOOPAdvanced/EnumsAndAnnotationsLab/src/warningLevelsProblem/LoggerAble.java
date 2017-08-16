package warningLevelsProblem;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:27.
 */
public interface LoggerAble {

    void addNewLog(Message message);

    Iterable<Message> getMessages();
}
