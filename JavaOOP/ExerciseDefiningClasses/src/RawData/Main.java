package RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 22.2.2017 г. at 18:32.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Car> cars = new LinkedList<>();

       int inputs=Integer.parseInt(reader.readLine());

        for (int i = 0; i < inputs; i++) {
            String[] arg=reader.readLine().split(" ");

            Car car = new Car(arg[0],Integer.parseInt(arg[1]),Integer.parseInt(arg[2]),Integer.parseInt(arg[3]),arg[4],
                    Double.parseDouble(arg[5]),Integer.parseInt(arg[6]),
                    Double.parseDouble(arg[7]),Integer.parseInt(arg[8]),
                    Double.parseDouble(arg[9]),Integer.parseInt(arg[10]),
                    Double.parseDouble(arg[11]),Integer.parseInt(arg[12]));

            cars.add(car);
        }

        String type=reader.readLine();

        for (Car car : cars) {
            if (type.equals("fragile") && car.isFragile()){
                System.out.println(car.getModel());
            }

            if (type.equals("flamable") && car.isFlamable()){
                System.out.println(car.getModel());
            }

        }

    }

}
