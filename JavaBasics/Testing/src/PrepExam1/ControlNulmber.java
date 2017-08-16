package PrepExam1;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 12.7.2017 г. at 21:24.
 */
public class ControlNulmber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int moves = 0;
        int sum = 0;
        int flag = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                moves++;
                int currentSum = (i * 2) + (j * 3);
                sum += currentSum;

                if (sum >= magicNumber) {
                    System.out.printf("%d moves%nScore: %d >= %d%n", moves, sum, magicNumber);
                    flag = 1;
                    break;
                }
            }
            if (flag==1) {
                break;
            }
        }

        if (flag==0) {
            System.out.printf("%d moves", moves);
        }

    }
}
