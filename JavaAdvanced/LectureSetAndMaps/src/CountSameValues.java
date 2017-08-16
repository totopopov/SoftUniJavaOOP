import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Lenovo on 25.1.2017 г..
 */
public class CountSameValues {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        HashMap<String,Integer> data = new HashMap<>();

        for (String s : input) {
            if (!data.containsKey(s)){
                data.put(s,1);
            }else {
                data.put(s, data.get(s)+1);
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : data.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " - "+ stringIntegerEntry.getValue() + " times");
        }




    }


}
