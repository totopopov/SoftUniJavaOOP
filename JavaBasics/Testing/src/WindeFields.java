import java.util.Scanner;

public class WindeFields {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int field = Integer.parseInt(scanner.nextLine());

        double kgPerM2 = Double.parseDouble(scanner.nextLine());

        int liters = Integer.parseInt(scanner.nextLine());

        int workers = Integer.parseInt(scanner.nextLine());

        double wine = field*0.4*kgPerM2/2.5;
        System.out.println(wine);

        if (wine >= liters) {
            double leftover = Math.ceil(wine - liters);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", leftover, Math.ceil(leftover / workers));
        } else {
            double leftover = Math.floor(liters - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", leftover);
        }

    }
}
