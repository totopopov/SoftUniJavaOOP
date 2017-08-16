package Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 19:03.
 */
public class Main {
    public static void main(String[] args) throws IOException, IllegalClassFormatException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        Ferrari ferrari = new Ferrari(name);

        System.out.println(ferrari);

        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }
    }
}
