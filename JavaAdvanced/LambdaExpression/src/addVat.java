import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.UnaryOperator;

/**
 * Created by Lenovo on 7.2.2017 г..
 */
public class addVat {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(", ");

        Double[] data = new Double[input.length];

        System.out.println("Prices with VAT:");

        UnaryOperator<Double> vatting = e -> e * 1.2;

        for (int i = 0; i < input.length; i++) {
            data[i] = Double.parseDouble(input[i]);
            data[i] = vatting.apply(data[i]);

                String out = String.format("%.2f",data[i]);
                System.out.println( out.replace('.',','));

        }
    }

}
