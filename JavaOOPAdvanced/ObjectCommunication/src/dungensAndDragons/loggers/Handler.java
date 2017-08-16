package dungensAndDragons.loggers;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 15:34.
 */
public interface Handler {
    void handle(LogType type, String message);

    void setSuccessor(Handler successor);
}
