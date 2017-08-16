package dungensAndDragons.loggers;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 16:01.
 */
public class ErrorLogger extends Logger {
    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ERROR) {
            System.out.println(String.format("%s: %s", type.name(), message));
        } else {
            passToSuccessor(type, message);
        }
    }
}
