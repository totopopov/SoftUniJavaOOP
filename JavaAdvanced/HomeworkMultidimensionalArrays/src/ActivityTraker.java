import java.util.*;

/**
 * Created by Lenovo on 20.1.2017 г..
 */
public class ActivityTraker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Integer inputLines = Integer.parseInt(sc.nextLine());

        String[] dataIn = new String[3];

        Integer month = 0;

        ArrayList<ArrayList<String>> db = new ArrayList<>();

        TreeMap<Integer, TreeMap<String, Double>> data = new TreeMap<>();

        for (int i = 0; i < inputLines; i++) {
            dataIn = sc.nextLine().split(" ");

            month = Integer.valueOf(dataIn[0].substring(3, 5));

            if (!data.containsKey(month)) {

                data.put(month, new TreeMap<>());
            }

            if (!data.get(month).containsKey(dataIn[1])) {

                data.get(month).put(dataIn[1], Double.valueOf(dataIn[2]));

            } else {

                data.get(month).put(dataIn[1], data.get(month).get(dataIn[1]) + Double.valueOf(dataIn[2]));

            }

        }


        for (Map.Entry<Integer, TreeMap<String, Double>> mapEntry : data.entrySet()) {
            System.out.print(mapEntry.getKey() + ": ");
            Integer size = mapEntry.getValue().size();
            Integer counter = 1;

            TreeMap<String, Double> entries = mapEntry.getValue();

            for (Map.Entry<String, Double> entry : entries.entrySet()) {

                System.out.print(entry.getKey() + "(" + entry.getValue().longValue()+ ")" + (counter < size ? ", " : ""));
                counter++;


            }

            System.out.println();


        }


    }


}
