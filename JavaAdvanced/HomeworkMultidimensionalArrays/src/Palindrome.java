import java.util.Scanner;

/**
 * Created by Lenovo on 18.1.2017 г..
 */
public class Palindrome {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");


        for (int i = 0; i < Integer.parseInt(input[0]) ; i++) {
            for (int j = 0; j < Integer.parseInt(input[1]); j++) {

                System.out.printf("%s%s%s ",(char)(i+97),(char)(j+i+97),(char)(i+97));

            }
            System.out.println();
        }



    }

}
