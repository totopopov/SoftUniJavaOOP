import java.math.BigInteger;
import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer num1=sc.nextInt();

        Integer num2=sc.nextInt();

        Integer num = num1;

        BigInteger output=new BigInteger("1");

        do {
           output= output.multiply(BigInteger.valueOf(num1));
            num1++;

        } while (num1<=num2);

        System.out.println("product["+num+".."+num2+"] = "+output);

    }


}
