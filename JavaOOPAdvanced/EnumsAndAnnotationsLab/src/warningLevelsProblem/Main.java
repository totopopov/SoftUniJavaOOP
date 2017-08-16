package warningLevelsProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:33.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String importancLevel = reader.readLine();

        LoggerAble logger = new Logger(importancLevel);

        String input;

        while (!"END".equals(input = reader.readLine())) {
            String[] tokens = input.split(": ");

            Message newMessage = new Message(tokens[0], tokens[1]);

            logger.addNewLog(newMessage);

        }


        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }

    }
}
