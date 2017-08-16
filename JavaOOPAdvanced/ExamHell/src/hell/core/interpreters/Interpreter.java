package hell.core.interpreters;

import hell.core.Cmd.Executable;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:18.
 */
public interface Interpreter {
    Executable interpretCommand(String line);
}
