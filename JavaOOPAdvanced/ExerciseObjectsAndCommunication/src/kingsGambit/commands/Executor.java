package kingsGambit.commands;

import kingsGambit.models.Military;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 20:49.
 */
public class Executor implements CommandExecutor {
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
