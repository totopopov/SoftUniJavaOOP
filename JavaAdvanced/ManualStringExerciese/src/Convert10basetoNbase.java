import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class Convert10basetoNbase {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        BigInteger number = new BigInteger(input[1]);

        String base = input[0];

        StringBuilder sb = new StringBuilder();

        while (number.compareTo(new BigInteger("0"))!=0){

            String digit =  number.mod(new BigInteger(base)).toString();

            number=number.divide(new BigInteger(base));

            sb.append(digit);

        }


        System.out.println(sb.reverse());


    }

}
