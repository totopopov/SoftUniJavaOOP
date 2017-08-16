package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 5.7.2017 г. at 21:50.
 */
public class Pokemon {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int person = Integer.parseInt(scanner.nextLine());
        double grape = x * y;
        double vine = (0.4 * grape) / 2.5;
        double leftVine = Math.round(vine - z);
        double needVine = Math.round(Math.abs(vine - z));
        double forPerson = needVine / person;

        if (vine < z) {
            System.out.printf("It will be a tough winter!" +
                    " More %f liters wine needed.\n", needVine);
        } else {
            System.out.printf("Good harvest this year! Total wine: %f liters.\n", vine);
            System.out.printf("%f liters left -> %f liters per person.", leftVine, forPerson);
        }

    }
}
