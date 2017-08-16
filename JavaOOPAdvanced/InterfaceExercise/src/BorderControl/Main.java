package BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 19:56.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Identifialble> countryMen=new LinkedList<>();

        String input;

        while (!"End".equals(input=reader.readLine())){

            String[] arguments=input.split(" ");

            if (arguments.length==2){
                Identifialble robot=new Robot(arguments[0],arguments[1]);
                countryMen.add(robot);
            }else {
                Citizen citizen=new Citizen(arguments[0],Integer.parseInt(arguments[1]),arguments[2]);
                countryMen.add(citizen);
            }
        }

        String id=(reader.readLine());

        countryMen.stream().filter(c->c.checkIDs(id)).forEach(c-> System.out.println(c.getId()));

    }
}
