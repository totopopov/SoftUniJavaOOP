package Testing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 15:26.
 */
public class Demo {
    public static void main(String[] args) {

        List<String> strings = new ArrayList();
        strings.add("1");
        strings.add("2");

        String e1 = (String) strings.get(0);
        String e2 = (String) strings.get(1);
        String e3 = (String.valueOf(strings.get(2))) ;


        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);





    }
}
