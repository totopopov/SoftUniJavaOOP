package CarSalesman;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 4:35.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Engine> engineData = new LinkedHashMap<>();
        List<Car> carData = new LinkedList<>();

        int engineInputs = Integer.parseInt(reader.readLine());

        for (int i = 0; i < engineInputs; i++) {
            String[] engineArgs = reader.readLine().split(" ");
            Engine engine = null;
            try {
                engine = new Engine(engineArgs[0], Integer.parseInt(engineArgs[1]),
                        Integer.parseInt(engineArgs[2]), engineArgs[3]);

            } catch (IndexOutOfBoundsException iobe) {

                try {
                    engine = new Engine(engineArgs[0], Integer.parseInt(engineArgs[1]),
                            Integer.parseInt(engineArgs[2]));

                } catch (IndexOutOfBoundsException iobe0) {
                    engine = new Engine(engineArgs[0], Integer.parseInt(engineArgs[1]));
                }

            } catch (NumberFormatException nfe) {
                engine = new Engine(engineArgs[0], Integer.parseInt(engineArgs[1]),
                        engineArgs[2]);
            }
            engineData.putIfAbsent(engine.getModel(), engine);
        }

        int carInputs = Integer.parseInt(reader.readLine());

        for (int i = 0; i < carInputs; i++) {
            Car car = null;

            String[] carArgs = reader.readLine().split(" ");

            String engineName = carArgs[1];

            Engine engine = null;

            if (engineData.containsKey(engineName)) {
                engine = engineData.get(engineName);
            } else {
                continue;
            }

            try {
                car = new Car(carArgs[0], engine,
                        Integer.parseInt(carArgs[2]), carArgs[3]);

            } catch (IndexOutOfBoundsException iobe) {
                try {
                    car = new Car(carArgs[0], engine,
                            Integer.parseInt(carArgs[2]));
                } catch (IndexOutOfBoundsException iobe1) {
                    car = new Car(carArgs[0], engine);
                }

            } catch (NumberFormatException nfe) {
                car = new Car(carArgs[0], engine,
                        carArgs[2]);
            }

            carData.add(car);
        }

        for (Car car : carData) {
            System.out.println(car);
        }

    }
}
