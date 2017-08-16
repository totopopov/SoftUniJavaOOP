package mentoring;

import java.util.Scanner;




public class romb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=size ; i++) {
            System.out.print(repeatStr(" ",size-i));
            System.out.print(repeatStr("* ",i));

            System.out.println();
        }

        for (int i = size-1; i >=1 ; i--) {

            System.out.print(repeatStr(" ",size-i));
            System.out.print(repeatStr("* ",i));

            System.out.println();
        }


    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}
