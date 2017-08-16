package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 5.7.2017 г. at 19:05.
 */
public class MultiplicationAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int number=Integer.parseInt(scanner.nextLine());

        boolean flag=true;

        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {

                    if (a<b && b<c && a+b+c==number) {
                        System.out.printf("%d + %d + %d = %d", a, b, c, number);
                        System.out.println();
                        flag=false;
                    }

                    if (a>b && b>c && a*b*c==number){
                        System.out.printf("%d * %d * %d = %d", a, b, c, number);
                        System.out.println();
                        flag=false;
                    }


                }
            }
        }

        if (flag){
            System.out.println("No!");
        }
        
        
    }
}
