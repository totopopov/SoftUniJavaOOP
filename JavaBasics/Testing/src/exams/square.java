package exams;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 8.7.2017 г. at 16:25.
 */
public class square {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int size=Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr("*", size*2));

        for (int i = 0; i < size/2; i++) {
            System.out.println(repeatStr(" ",2*size-i-1)+repeatStr("*",2*i+1));
        }
        for (int i = 0; i < size/2; i++) {
            System.out.println(repeatStr(" ",size-i-1)+repeatStr("*",2*(i+size)+1));
        }
        for (int i = 0; i < size/2; i++) {
            System.out.println(repeatStr(" ",i)+repeatStr("*",2*(i+size)+1));
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
