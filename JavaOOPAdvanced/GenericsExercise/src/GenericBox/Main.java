package GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 18.3.2017 г. at 4:01.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Box<Double>> dataStorage=new ArrayList<>();
        int inputs=Integer.parseInt(reader.readLine());

        for (int i = 0; i < inputs; i++) {
            Box<Double> box=new Box<>(Double.parseDouble(reader.readLine()));
            //Box<String> box=new Box<>(reader.readLine());
          // Box<Integer> box=new Box<>(Integer.parseInt(reader.readLine()));
            dataStorage.add(box);
        }
//
//        int[] swaps = Arrays.stream(reader.readLine().split(" "))
//                .mapToInt(Integer::parseInt).toArray();
//
//        BoxUtils.swapElements(swaps[0],swaps[1],dataStorage);
//
//        for (Box<Integer> box : dataStorage) {
//            System.out.println(box);
//        }

        Box<Double> element = new Box<>(Double.parseDouble(reader.readLine()));

        System.out.println(BoxUtils.genericCount(element, dataStorage));


    }
}
