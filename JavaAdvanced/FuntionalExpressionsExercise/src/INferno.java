import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 9.2.2017 г..
 */
public class INferno {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> gems = Arrays.stream(reader.readLine().split(" "))
                .map(c -> Integer.parseInt(c)).collect(Collectors.toList());

        boolean[] checks = new boolean[gems.size()];
        List<String> commands = new ArrayList<>();

        String commnad;

        while (!"Forge".equals(commnad = reader.readLine())) {

            String[] tokens = commnad.split(";");

            if ("Exclude".equals(tokens[0])) {
                commands.add(tokens[1] + ";" + tokens[2]);
            } else {
                int index = commands.lastIndexOf(tokens[1] + ";" + tokens[2]);
                commands.remove(index);
            }
        }

        for (String command : commands) {

            String[] tokens = command.split(";");

            int sum = Integer.parseInt(tokens[1]);
            tokens = tokens[0].split(" ");

            if (tokens.length == 3) {
                sumRightLeft(gems, sum, checks);
            } else if ("Left".equals(tokens[1])) {
                sumLeft(gems, sum, checks);
            } else {
                sumRight(gems, sum, checks);
            }


        }

        for (int i = 0; i < gems.size(); i++) {
            if (!checks[i]){
                System.out.print(gems.get(i)+" ");
            }

        }

    }

    private static void sumRightLeft(List<Integer> gems, int sum, boolean[] checks) {
        for (int i = 0; i < gems.size(); i++) {
            if ((i > 0 ? gems.get(i-1) : 0) + ((i < gems.size() - 1) ? gems.get(i + 1) : 0) + gems.get(i) == sum) {
                checks[i] = true;
            }
        }
    }

    private static void sumRight(List<Integer> gems, int sum, boolean[] checks) {
        for (int i = 0; i < gems.size(); i++) {
            if (((i < gems.size() - 1) ? gems.get(i + 1) : 0) + gems.get(i) == sum) {
                checks[i] = true;
            }
        }
    }

    public static void sumLeft(List<Integer> gems, int sum, boolean[] checks) {
        for (int i = 0; i < gems.size(); i++) {
            if ((i > 0 ? gems.get(i-1) : 0) + gems.get(i) == sum) {
                checks[i] = true;
            }
        }
    }

}
