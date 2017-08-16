package loggerProblem.Appenders;

import loggerProblem.Layouts.Layout;

/**
 * Created by Todor Popov using Lenovo on 5.4.2017 г. at 19:29.
 */
public class ConsoleAppender implements Appender {
    private Layout layout;

    public ConsoleAppender(Layout simpleLayout) {
        this.layout =simpleLayout;
    }

}
