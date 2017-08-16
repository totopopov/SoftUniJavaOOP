import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 21.7.2017 г. at 19:30.
 */
public class SpecialNumber {
    public static void main(String[] args) {

        System.out.println(String.format("%s",null));

        Scanner scanner = new Scanner(System.in);


        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        int specialNumber = Integer.parseInt(scanner.nextLine());
        int controlNumber = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = l; k >= 1; k--) {

                    if ((i + j + k) % 3 == 0) {     //
                        specialNumber += 5;
                    } else if (k == 5) {
                        specialNumber -= 2;
                    } else if (k % 2 == 0) {
                        specialNumber *= 2;
                    }

                    if (specialNumber >= controlNumber) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNumber);
                        return;
                    }


                }
            }
        }

        System.out.printf("No! %d is the last reached special number.",specialNumber);


    }
}
