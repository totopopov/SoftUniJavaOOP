import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Lenovo on 31.1.2017 г..
 */
public class Results {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int lines = Integer.parseInt(reader.readLine());

        TreeMap<String, Double[]> data = new TreeMap<>();

        for (int i = 0; i < lines; i++) {

            String[] input = reader.readLine().split(" - ");

            String name = input[0];

            Double[] scores = new Double[4];

            String[] stringScores = input[1].split(", ");

            Double avg = 0.0;
            for (int j = 0; j < stringScores.length; j++) {
                scores[j] = Double.parseDouble(stringScores[j]);
                avg += scores[j] / 3;
            }

            scores[3] = avg;
            data.put(name, scores);
        }

        if (!data.isEmpty()) {
            System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));

            for (Map.Entry<String, Double[]> entry : data.entrySet()) {

                System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", entry.getKey(), entry.getValue()[0], entry.getValue()[1], entry.getValue()[2], entry.getValue()[3]).replace(".", ","));
            }
        }
    }
}
