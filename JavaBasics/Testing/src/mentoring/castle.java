package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 30.6.2017 г. at 16:32.
 */
public class castle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size=Integer.parseInt(scanner.nextLine());

        System.out.println("/"+repeatStr("^",size/2)+"\\"
                +repeatStr("_",size-(2+size/2))
                +repeatStr("_",size-(2+size/2))
        +"/"+repeatStr("^",size/2)+"\\");

        for (int i = 0; i < size-2; i++) {
            if (i==size-3){
                System.out.println("|"+repeatStr(" ",size/2+1)
                        +repeatStr("_",2*(size-(2+size/2)))
                        +repeatStr(" ",size/2+1)
                        +"|");
            } else {
                System.out.println("|"
                        + repeatStr(" ", 2 * size - 2)
                        + "|");
            }
        }

        System.out.println("\\"+repeatStr("_",size/2)+"/"
                +repeatStr(" ",size-(2+size/2))
                +repeatStr(" ",size-(2+size/2))
                +"\\"+repeatStr("_",size/2)+"/");




    }
    public static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}
