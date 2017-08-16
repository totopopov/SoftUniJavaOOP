package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 5.7.2017 г. at 20:52.
 */
public class stipidPass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int stepDigit=Integer.parseInt(scanner.nextLine());
        int stepLetters=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= stepDigit; i++) {
            for (int j = 1; j <= stepDigit; j++) {
                for (char k = 'a'; k < 'a'+ stepLetters; k++) {
                    for (char l = 'a'; l <'a'+ stepLetters; l++) {
                        for (int m = 1; m <= stepDigit; m++) {
                            if (m>i && m>j){
                                System.out.printf("%s%s%s%s%s ",i,j,k,l,m);
                            }
                        }
                    }
                }
            }
        }





    }
}
