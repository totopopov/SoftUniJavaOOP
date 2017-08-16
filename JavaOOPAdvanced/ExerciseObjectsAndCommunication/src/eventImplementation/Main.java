package eventImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 12.4.2017 г. at 19:33.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Dispatcher dispatcher=new Dispatcher();
        NameChangeListener listener=new Handler();
        dispatcher.addNameChangeListener(listener);


        String input;

        while (!"End".equals(input=reader.readLine())){

            dispatcher.setName(input);

        }
    }
}
