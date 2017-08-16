package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 5.7.2017 г. at 20:21.
 */
public class numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= size; i++) {

            for (int j = 0; j < size; j++) {

                int number=i+j;
                if (number>size){
                    System.out.print(size-number%size+" ");
                }else {
                    System.out.print(number+" ");
                }

                number++;
            }
            System.out.println();
        }





    }
}
