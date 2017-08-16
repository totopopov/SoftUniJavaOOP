package lastMeeting;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 20.7.2017 г. at 12:04.
 */
public class Hat {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int left = 6 * size - 3;


        for (int i = 0; i < 2 * size; i++) {
            System.out.println(repeatStr(".", left) +
                    repeatStr("###", i) + "#" +
                    repeatStr("###", i) +
                    repeatStr("...", 2 * size - 1 - i));

            left -= 3;
        }
        for (int i = 1; i <= size - 1; i++) {
            System.out.println("|" + repeatStr(".", 3 * i - 1)
                    + repeatStr("###", 2 * size - 1 - i) + "#"
                    + repeatStr("###", 2 * size - 1 - i) +
                    repeatStr(".", 3 * i));
        }
        String sybol = "|";
        for (int i = 0; i < size - 1; i++) {

            if (i == size - 2) {
                sybol = "@";
            }
            System.out.println(sybol + repeatStr(".", 3 * (size - 1) - 1)
                    + repeatStr("###", size) + "#"
                    + repeatStr("###", size) +
                    repeatStr("...", (size - 1))
            );
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
