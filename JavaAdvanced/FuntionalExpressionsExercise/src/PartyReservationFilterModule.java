import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Lenovo on 9.2.2017 г..
 */
public class PartyReservationFilterModule {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = reader.readLine().split(" ");

        ArrayList<String> filters = new ArrayList<>();
        String line;

        while (!"Print".equals(line = reader.readLine())) {

            String[] token = line.split(";");

            if ("Add filter".equals(token[0])) {
                filters.add(token[1] + ";" + token[2]);
            } else {
                filters.removeIf(e -> e.equals(token[1] + ";" + token[2]));
            }
        }


        for (String s : list) {

            boolean print = true;

            for (String filter : filters) {

                String[] tokens = filter.split(";");

                String param = tokens[1];

                switch (tokens[0]) {
                    case "Starts with":
                        if (s.substring(0, param.length()).equals(param)) {
                            print = false;
                        }
                        break;
                    case "Ends with":
                        if (s.substring(s.length() - param.length()).equals(param)) {
                            print = false;
                        }
                        break;
                    case "Length":
                        if (s.length() == Integer.parseInt(param)) {
                            print = false;
                        }
                        break;
                    case "Contains":
                        if (s.contains(param)) {
                            print = false;
                        }
                        break;
                }
            }
            if (print) {
                System.out.print(s + " ");

            }

        }


    }

}
