//import java.util.Scanner;
//
///**
// * Created by Todor Popov using Lenovo on 27.5.2017 г. at 17:31.
// */
//public class converter {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        double curency = Double.parseDouble(scanner.nextLine());
//        String curencyFirst = scanner.nextLine();
//        String curencySecond = scanner.nextLine();
//
//
//        if (curencyFirst.equals("BGN")) {
//            if (curencySecond.equals("USD")) {
//                System.out.printf("%.2f", curency / 1.79549);
//            } else if (curencySecond.equals("EUR")) {
//                System.out.printf("%.2f", curency / 1.95583);
//            } else if (curencySecond.equals("GBP")) {
//                System.out.printf("%.2f", curency / 2.53405);
//            }
//        } else if (curencyFirst.equals("USD")) {
//            if (curencySecond.equals("BGN")) {
//                System.out.printf("%.2f", curency * 1.79549);
//            } else if (curencySecond.equals("EUR")) {
//                System.out.printf("%.2f", curency / 1.95583 * 1.79549);
//            } else if (curencySecond.equals("GBP")) {
//                System.out.printf("%.2f", curency / 2.53405 * 1.79549);
//            }
//        } else if (curencyFirst.equals("EUR")) {
//            if (curencySecond.equals("BGN")) {
//                System.out.printf("%.2f", curency * 1.95583);
//            } else if (curencySecond.equals("USD")) {
//                System.out.printf("%.2f", curency / 1.79549 * 1.95583);
//            } else if (curencySecond.equals("GBP")) {
//                System.out.printf("%.2f", curency / 2.53405 * 1.95583);
//            }
//        } else if (curencyFirst.equals("GBP")) {
//            if (curencySecond.equals("BGN")) {
//                System.out.printf("%.2f", curency * 2.53405);
//            } else if (curencySecond.equals("USD")) {
//                System.out.printf("%.2f", curency / 1.79549 * 2.53405);
//            } else if (curencySecond.equals("EUR")) {
//                System.out.printf("%.2f", curency / 1.95583 * 2.53405);
//            }
//        }
//
//
//    }
//}
