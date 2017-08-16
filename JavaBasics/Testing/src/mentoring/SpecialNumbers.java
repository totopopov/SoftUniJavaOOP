package mentoring;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 5.7.2017 г. at 21:32.
 */
public class SpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
        int digit= Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=9 ; i++) {
            if (digit%i==0){
                for (int j = 1; j <=9 ; j++) {
                    if (digit%j==0){
                        for (int k = 1; k <=9 ; k++) {
                            if (digit%k==0){
                                for (int l = 1; l <=9 ; l++) {
                                    if ( digit%l==0){
                                        System.out.printf("%s%s%s%s ",i,j,k,l);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
