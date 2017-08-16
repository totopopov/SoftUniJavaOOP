package io;

/**
 * Created by Todor Popov using Lenovo on 22.4.2017 г. at 1:13.
 */
public class ConsoleWriter implements Writer {
    @Override
    public void writeLn(String message) {
        System.out.println(message);
    }

    @Override
    public void write(String message) {
        System.out.printf("%s",message);
    }

}
