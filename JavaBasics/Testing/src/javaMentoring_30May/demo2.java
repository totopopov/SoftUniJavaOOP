package javaMentoring_30May;


import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int firstSum = 0;
        int nextSum = 0;
        int maxDiff = 0;
        int dif = 0;

        for (int i = 0; i < n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());

            if (i == 0) {
                firstSum = number1 + number2;
            } else {
                nextSum = number1 + number2;
                dif = Math.abs(nextSum - firstSum);

                if (dif > maxDiff) {

                    maxDiff = dif;
                }

                firstSum = nextSum;

            }

        }
        if (maxDiff == 0) {
            System.out.printf("Yes, value=&s", firstSum);
        } else {
            System.out.printf("No, maxdiff=%s ", maxDiff);
        }


    }

}
