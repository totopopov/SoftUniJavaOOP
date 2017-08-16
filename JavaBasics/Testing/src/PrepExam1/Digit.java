package PrepExam1;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 12.7.2017 г. at 19:22.
 */
public class Digit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String numberS = scanner.nextLine();
//
//        String d1igitOneC=String.valueOf (numberS.charAt(0));
//        String d1igitTwoC=String.valueOf(numberS.charAt(1));
//        String d1igitThreeC=String.valueOf(numberS.charAt(2));
//
//        int digitOne=Integer.parseInt(d1igitOneC);
//        int digitTwo=Integer.parseInt(d1igitTwoC);
//        int digitThree=Integer.parseInt(d1igitThreeC);
//        int number=Integer.parseInt(numberS);


        int number=Integer.parseInt(scanner.nextLine());




        int digitOne=number/100;
        //int digitTwo=(number-100*digitOne)/10;
        int digitTwo=number / 10 - (number / 100)*10 ;
        //int digitTwo=(number%100)/10;
        int digitThree=number%10;

        int n=digitOne+digitTwo;
        int m=digitOne+digitThree;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {

                if (number%5==0){
                    number-=digitOne;

                }else if(number%3==0){
                    number-=digitTwo;

                }else {
                    number+=digitThree;

                }
                System.out.printf("%d",number);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        
        
        String Debug="";





    }
}
