import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Lenovo on 24.1.2017 г..
 */
public class CarNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        HashSet<String> parking = new HashSet<>();

        String input = "";

        while (!("END").equals(input=sc.nextLine())){

            String[] command = input.split(", ");

            if (("IN").equals(command[0])){

                parking.add(command[1]);
            } else {
                parking.remove(command[1]);
            }
        }

        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : parking) {
                System.out.println(s);
            }
        }


    }

}
