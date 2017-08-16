package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 5.7.2017 г. at 19:35.
 */
public class fibunaci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int step = Integer.parseInt(scanner.nextLine());

        int fibBase=0;
        int fibNext=1;

        for (int i = 0; i < step; i++) {
            int help=fibNext;
            fibNext=fibNext+fibBase;
            fibBase=help;
        }

        System.out.println(fibNext);

    }
}
