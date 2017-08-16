package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 5.7.2017 г. at 19:48.
 */
public class pyramidNumb {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        int counter=1;


        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter+" ");

                if (counter==number){
                    break;
                }
                counter++;
            }
            if (counter==number){
                break;
            }
            System.out.println();
        }
    }
}
