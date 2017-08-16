import java.math.BigDecimal;
import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer distance = sc.nextInt();

        String day = sc.next();

        BigDecimal price = new BigDecimal("1");

        if (distance < 20) {
            price = price.multiply(BigDecimal.valueOf(distance)
                    .multiply(BigDecimal.valueOf(day.equals("day") ? 0.79 : 0.9)))
                    .add(BigDecimal.valueOf(0.7));
        } else if (distance < 100) {
            price = price.multiply(BigDecimal.valueOf(distance)).multiply(BigDecimal.valueOf(0.09));
        } else {
            price = price.multiply(BigDecimal.valueOf(distance)).multiply(BigDecimal.valueOf(0.06));
        }

        System.out.printf("%.2f",price);

    }

}
