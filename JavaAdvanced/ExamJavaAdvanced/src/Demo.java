import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Lenovo on 19.2.2017 г..
 */
public class Demo {

    public static void main(String[] args) {


        BigDecimal test =new BigDecimal(1);
        test=test.divide(new BigDecimal(99*99),5);

        String debug="";
       System.out.printf("%s",test.toPlainString());
    }

}
