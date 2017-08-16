package CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 20:06.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomList<String> data= new CustomListImpl<String>();

        String input;

        while (!"END".equals(input=reader.readLine())){
            String[] tokens = input.split("\\s+");

            String command=tokens[0];

            switch (command){
                case "Add":
                    data.add(tokens[1]);
                    break;
                case "Remove":
                    data.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(data.contains(tokens[1]));
                    break;
                case "Swap":
                    data.swap(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(data.countGreaterThat(tokens[1]));
                    break;
                case "Max":
                    System.out.println(data.getMax());
                    break;
                case "Min":
                    System.out.println(data.getMin());
                    break;
                case "Print":
                    for (String datum : data) {
                        System.out.println(datum);
                    }
                    break;
                case "Sort":
                    Sorter.sort(data);
                    break;

                    default:
                        break;
            }
        }

    }
}
