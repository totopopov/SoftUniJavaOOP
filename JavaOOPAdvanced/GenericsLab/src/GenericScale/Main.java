package GenericScale;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 17:05.
 */
public class Main {

    public static void main(String[] args) {

        Scale<String> stringScale=new Scale<>("a","c");

        System.out.println(stringScale.getHeavier());


        Scale<Integer> integerScale=new Scale<>(1,2);

        System.out.println(integerScale.getHeavier());

    }

}
