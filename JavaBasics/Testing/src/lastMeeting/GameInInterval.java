package lastMeeting;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 20.7.2017 г. at 11:17.
 */
public class GameInInterval {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        int count = Integer.parseInt(scaner.nextLine());

        double points = 0;

        double count9 = 0;
        double count19 = 0;
        double count29 = 0;
        double count39 = 0;
        double count50 = 0;
        double invalid = 0;

        for (int i = 0; i < count; i++) {

            int currentNumber = Integer.parseInt(scaner.nextLine());

            if (currentNumber >= 0) {
                if (currentNumber <= 9) {
                    points += currentNumber * 0.2;
                    count9++;
                } else if (currentNumber <= 19) {
                    points += currentNumber * 0.3;
                    count19++;
                } else if (currentNumber <= 29) {
                    points += currentNumber * 0.4;
                    count29++;
                } else if (currentNumber <= 39) {
                    points += 50;
                    count39++;
                } else if (currentNumber <= 50) {
                    points += 100;
                    count50++;
                }
            }

            if (currentNumber < 0 || currentNumber > 50) {
                points = points / 2;
                invalid++;
            }

        }
        System.out.printf("%.2f%n",points);
        System.out.printf("From 0 to 9: %.2f%%%n",count9/count*100);
        System.out.printf("From 10 to 19: %.2f%%%n",count19/count*100);
        System.out.printf("From 20 to 29: %.2f%%%n",count29/count*100);
        System.out.printf("From 30 to 39: %.2f%%%n",count39/count*100);
        System.out.printf("From 40 to 50: %.2f%%%n",count50/count*100);
        System.out.printf("Invalid numbers: %.2f%%%n",invalid/count*100);
    }


}
