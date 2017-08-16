import java.util.Locale;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        Double num1 = scanner.nextDouble();

        Double num2 = scanner.nextDouble();

        Double num3 = scanner.nextDouble();

        Double avg = (num1 + num2 + num3)/3;

        System.out.printf("%.2f",avg);

    }
}
