import java.util.Scanner;

public class testing {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());

        for ( int n=0 ;n<a;n++){
            System.out.print("*");
        }
        System.out.println();
        for ( int n=0 ;n<a-2;n++) {
            System.out.print("*");
            for ( int c=0;c<a-2;c++){
                System.out.print(" ");}
            System.out.println("*");
        }
        for ( int n=0 ;n<a;n++){
            System.out.print("*");
        }

    }}