package trafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 21:36.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        List<TrafficLight> trafficLights = new ArrayList<>();


        for (String string : input) {
            TrafficLight trafficLight= new TrafficLight(string);
            trafficLights.add(trafficLight);
        }

        int switches = Integer.parseInt(reader.readLine());

        for (int i = 0; i < switches; i++) {
            StringBuilder sb = new StringBuilder();
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.switchLight();
                sb.append(trafficLight).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }
}
