package DB;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 28.6.2017 г. at 15:27.
 */
public class main {
    public static void main(String[] args) {

        Test test= new Test(5);
        Map<Integer,String> data = new HashMap<>();

        String testing = data.get(5);
        System.out.println(testing);


        System.out.println();

    }
}
