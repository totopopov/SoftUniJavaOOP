import org.omg.CORBA.INTERNAL;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Lenovo on 25.1.2017 г..
 */
public class MinerTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> data = new LinkedHashMap<>();


        String input = sc.nextLine();

        while (!("stop").equals(input)){

            int volume = Integer.parseInt(sc.nextLine());

            if (data.containsKey(input)){
                data.put(input, data.get(input)+volume);
            }else {
                data.put(input,volume);
            }
            input=sc.nextLine();
        }

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }


    }
}
