package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 12.3.2017 г. at 16:55.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        CarManager carManager = new CarManager();

        String input;

        while (!"Cops Are Here".equals(input = reader.readLine())) {
            String[] arg = input.split(" ");
            switch (arg[0]) {
                case "register":
                    carManager.register(Integer.parseInt(arg[1]), arg[2], arg[3], arg[4], Integer.parseInt(arg[5]),
                            Integer.parseInt(arg[6]), Integer.parseInt(arg[7]),
                            Integer.parseInt(arg[8]), Integer.parseInt(arg[9]));
                    break;
            case "open":
                switch (arg[2]) {
                    case "Drag":
                    case "Casual":
                    case "Drift":
                        carManager.open(Integer.parseInt(arg[1]), arg[2], Integer.parseInt(arg[3]),
                                arg[4], Integer.parseInt(arg[5]));
                        break;
                    case "Circuit":
                    case "TimeLimit":
                        carManager.openBonus(Integer.parseInt(arg[1]), arg[2], Integer.parseInt(arg[3]),
                                arg[4], Integer.parseInt(arg[5]),Integer.parseInt(arg[6]));
                        break;
                }
                break;
            case "participate":
                carManager.participate(Integer.parseInt(arg[1]), Integer.parseInt(arg[2]));
                break;
            case "check":
                System.out.println(carManager.check(Integer.parseInt(arg[1])));
                break;
            case "start":
                System.out.println(carManager.start(Integer.parseInt(arg[1])));
                break;
            case "tune":
                carManager.tune(Integer.parseInt(arg[1]), arg[2]);
                break;
            case "park":
                carManager.park(Integer.parseInt(arg[1]));
                break;
            case "unpark":
                carManager.unpark(Integer.parseInt(arg[1]));
                break;
        }

    }


}
}
