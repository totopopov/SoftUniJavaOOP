package javaMentoring_30May;


import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        String inCurrency = scanner.nextLine();
        String outCurrency = scanner.nextLine();



        if (inCurrency.equals("BGN")) {
            if (outCurrency.equals("USD")) {
                System.out.printf("%.2f",money / 1.79549);
            } else if (outCurrency.equals("EUR")) {
                System.out.printf("%.2f",money / 1.95583);
            } else if (outCurrency.equals("GBP")) {
                System.out.printf("%.2f",money / 2.53405);
            }
        } else if (inCurrency.equals("USD")) {
            if (outCurrency.equals("BGN")) {
                System.out.printf("%.2f",money * 1.79549);
            } else if (outCurrency.equals("EUR")) {
                System.out.printf("%.2f",money*1.79549 / 1.95583);
            } else if (outCurrency.equals("GBP")) {
                System.out.printf("%.2f",money*1.79549 / 2.53405);
            }
        }
    }
}
