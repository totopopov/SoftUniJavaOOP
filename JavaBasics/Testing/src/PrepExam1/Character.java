package PrepExam1;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 12.7.2017 г. at 20:01.
 */
public class Character {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numberS=scanner.nextLine();

        char digitOne=numberS.charAt(0);
        System.out.println((int)digitOne-48);

        int number=Integer.parseInt(numberS);
        System.out.println(number);

    }
}
