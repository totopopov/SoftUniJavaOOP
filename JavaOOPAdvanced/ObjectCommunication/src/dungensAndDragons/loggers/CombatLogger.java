package dungensAndDragons.loggers;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 15:41.
 */
public class CombatLogger extends Logger {
    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ATTACK || type == LogType.MAGIC || type == LogType.TARGET) {
            System.out.println(String.format("%s: %s", type.name(), message));
        } else {
            passToSuccessor(type, message);
        }
    }
}
