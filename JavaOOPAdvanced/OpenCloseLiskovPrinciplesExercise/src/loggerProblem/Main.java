package loggerProblem;

import loggerProblem.Appenders.Appender;
import loggerProblem.Appenders.ConsoleAppender;
import loggerProblem.Layouts.Layout;
import loggerProblem.Layouts.SimpleLayout;
import loggerProblem.Loggers.Logger;
import loggerProblem.Loggers.MessageLogger;

/**
 * Created by Todor Popov using Lenovo on 5.4.2017 г. at 19:27.
 */
public class Main {
    public static void main(String[] args) {
        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);


        logger.logError("3/26/2015 2:08:11 PM","Error parsing JSON.");
        logger.logError("3/26/2015 2:08:11 PM","User Pesho successfully registered.");
    }
}
