import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 29.5.2017 г. at 23:21.
 */
public class training {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w=Double.parseDouble(scanner.nextLine());
        double h=Double.parseDouble(scanner.nextLine());

        double rows=w/1.2;
        double deskPerRow=(h-1)/0.7;

        int workingPlaces=new Double(rows).intValue() * new Double(deskPerRow).intValue();

        System.out.println(workingPlaces-3);

    }
}
