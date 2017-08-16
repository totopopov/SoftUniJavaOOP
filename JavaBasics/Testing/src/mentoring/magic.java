package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 5.7.2017 г. at 21:19.
 */
public class magic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int digit=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <=9 ; m++) {
                            for (int n = 0; n <= 9; n++) {
                                if (i*j*k*l*m*n==digit){
                                    System.out.printf("%s%s%s%s%s%s ",i,j,k,l,m,n);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
