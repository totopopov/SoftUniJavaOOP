package dungensAndDragons.executorCommand;

/**
 * Created by Todor Popov using Lenovo on 11.4.2017 г. at 16:05.
 */
public class CommandExecutor implements Executor {
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
