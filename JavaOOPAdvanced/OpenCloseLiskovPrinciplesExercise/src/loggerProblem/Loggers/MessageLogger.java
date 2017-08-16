package loggerProblem.Loggers;

import loggerProblem.Appenders.Appender;

/**
 * Created by Todor Popov using Lenovo on 5.4.2017 г. at 19:30.
 */
public class MessageLogger implements Logger {

    public MessageLogger(Appender consoleAppender) {
    }

    @Override
    public void logError(String timeStamp, String errorMessage) {

    }
}
