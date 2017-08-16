package ArrayList;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 19:34.
 */
public class Main {
    public static void main(String[] args) {

        RandomArrayList list=new RandomArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add("Stamat");
        list.add("Orlandovci");

        while (!list.isEmpty()){
            System.out.println(list.getRandomElement());
        }



    }
}
