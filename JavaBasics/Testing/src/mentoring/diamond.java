package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 30.6.2017 г. at 15:17.
 */
public class diamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int upperPart=size/2;

        if (size==1){
            System.out.println("*");
        } else if (size%2==1){


            System.out.println(repeatStr("-",upperPart)+"*"
            +repeatStr("-",upperPart));

            for (int i = 0; i < upperPart; i++) {
                System.out.println(repeatStr("-",upperPart-i-1)+"*"
                +repeatStr("-",1+i*2)
                +"*"+repeatStr("-",upperPart-i-1));
            }

            for (int i = upperPart-1; i > 0; i--) {
                System.out.println(repeatStr("-",upperPart-i)+"*"
                        +repeatStr("-",i*2-1)
                        +"*"+repeatStr("-",upperPart-i));
            }

            System.out.println(repeatStr("-",upperPart)+"*"
                    +repeatStr("-",upperPart));

        }else {

            for (int i = 0; i < upperPart; i++) {
                System.out.println(repeatStr("-",upperPart-i-1)+"*"
                        +repeatStr("-",i*2)
                        +"*"+repeatStr("-",upperPart-i-1));
            }

            for (int i = upperPart-1; i > 0; i--) {
                System.out.println(repeatStr("-",upperPart-i)+"*"
                        +repeatStr("-",i*2-2)
                        +"*"+repeatStr("-",upperPart-i));
            }



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
