import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Lenovo on 25.1.2017 г..
 */
public class CountSymbols {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Character,Integer> data = new TreeMap<>();

        char[] input =sc.nextLine().toCharArray();


        for (char c : input) {
            if (!data.containsKey(c)){
                data.put(c,1);
            }else {
                data.put(c,data.get(c)+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey()+": "+ entry.getValue()+" time/s");
        }

    }


}
