package PrepExam1;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 12.7.2017 г. at 18:31.
 */
public class Axe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());

        int left = size * 3;
        int right = 2 * (size - 1);
        int mid = 0;

        int handleSize = size / 2;

        //top
        for (int i = 0; i < size; i++) {

            System.out.println(repeatStr("-", left) +
                    "*" +
                    repeatStr("-", mid) +
                    "*" + repeatStr("-", right));

            right--;
            mid++;
        }

        right++;
        mid--;

        //mid
        for (int i = 0; i < handleSize; i++) {
            System.out.println(repeatStr("*", left) +
                    "*" +
                    repeatStr("-", mid) + "*"
                    + repeatStr("-", right));

        }

        //bottom
        for (int i = 0; i < size / 2; i++) {

            System.out.println(repeatStr("-", left)
                    + "*"
                    + repeatStr(i==size/2-1?"*":"-", mid)
                    + "*"
            +repeatStr("-",right));

            left--;
            mid+=2;
            right--;
        }


    }

    public static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}
