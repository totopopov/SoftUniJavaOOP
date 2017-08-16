import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class ConvertNbaseto10Base {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        char[]number=input[1].toCharArray();

        String base = input[0];

        BigInteger output = new BigInteger("0");

        for (int i = 0; i <number.length ; i++) {

            int currentdigit=Integer.valueOf(number[number.length-i-1])-48;


           output=output.add(new BigInteger(String.valueOf(currentdigit)).multiply(new BigInteger(base).pow(i)));

        }

        System.out.println(output);





    }
}
