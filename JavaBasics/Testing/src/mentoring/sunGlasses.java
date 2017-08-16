package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 30.6.2017 г. at 14:43.
 */
public class sunGlasses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());


        System.out.println(repeatStr("*",size*2)
                + repeatStr(" ",size) + repeatStr("*",size*2));

        for (int i = 0; i < size-2; i++) {

            System.out.print("*"+repeatStr("/",(size-1)*2)+"*");

            if (((size-2)/2)-size%2==i){
                System.out.print(repeatStr("|",size));
            }else {
                System.out.print(repeatStr(" ",size));
            }

            System.out.print("*"+repeatStr("/",(size-1)*2)+"*");
            System.out.println();
        }


        System.out.print(repeatStr("*",size*2));
        System.out.print(repeatStr(" ",size));
        System.out.print(repeatStr("*",size*2));




    }

    public static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}
