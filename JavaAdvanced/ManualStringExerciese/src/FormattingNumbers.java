import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class FormattingNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] input = reader.readLine().split("\\s+");

        String intToHex=Integer.toHexString(Integer.parseInt(input[0])).toUpperCase();
        String intToBinary =Integer.toBinaryString(Integer.parseInt(input[0]));

        if (intToBinary.length()>10){
            intToBinary=intToBinary.substring(0,10);
        }else if (intToBinary.length()<10){
            int size=intToBinary.length();
            for (int i = 0; i <10-size; i++) {
             intToBinary="0".concat(intToBinary);
            }
        }

        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        System.out.println(String.format("|%-10s|%s|%10.2f|%-10.3f|",intToHex,intToBinary,b,c));




    }

}
