package app.interpreters;


import app.conntacts.Executable;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:18.
 */
public interface Interpreter {
    Executable interpretCommand(String line);
}
