import java.util.Scanner;

/**
 * Created by CECI on 14.6.2017 г..
 */
public class dobuleVsFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        int weekend = 48;
        double  sum =(Math.floor((48-h)*3.0/4)+h+p*2.0/3);


        if (year.equals("normal")){

            System.out.println(Math.floor(sum));
        } else {
            System.out.println(Math.floor(sum+(sum * 0.15)));
        }
    }
}