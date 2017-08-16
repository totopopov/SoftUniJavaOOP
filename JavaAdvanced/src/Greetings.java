import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String line1 = sc.nextLine();

        String line2=sc.nextLine();

        System.out.printf("Hello, %s %s!",line1.equals("")?"*****":line1,line2.equals("")?"*****":line2 );


    }

}
