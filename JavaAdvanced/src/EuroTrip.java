import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner sc = new Scanner(System.in);

        Double input = sc.nextDouble();

        BigDecimal exchage= new BigDecimal("4210500000000");

        BigDecimal value =new BigDecimal(input*1.2);

        exchage=exchage.multiply(value);

        System.out.printf("%.2f marks", exchage);

    }
}
