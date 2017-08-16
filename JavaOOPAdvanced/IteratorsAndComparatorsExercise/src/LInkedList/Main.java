package LInkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 29.3.2017 г. at 3:38.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> data = new CustomList<>();

        int inputLines=Integer.parseInt(reader.readLine());

        for (int i = 0; i < inputLines; i++) {
            String[] inputs=reader.readLine().split(" ");

            switch (inputs[0]){
                case "Add":
                    data.add(Integer.valueOf(inputs[1]));
                    break;
                case "Remove":
                    data.remove(Integer.valueOf(inputs[1]));
                    break;
            }
        }
        System.out.println(data.size());

        System.out.println(data.stream().map(e -> e.toString()).collect(Collectors.joining(" ")));
    }
}
