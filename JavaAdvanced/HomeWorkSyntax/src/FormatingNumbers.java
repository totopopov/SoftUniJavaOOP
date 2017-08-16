import java.util.Scanner;

/**
 * Created by Lenovo on 20.1.2017 г..
 */
public class FormatingNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        Integer num1 = Integer.parseInt(input[0]);
        Float num2 = Float.parseFloat(input[1]);
        Double num3 = Double.parseDouble(input[2]);

        String hexa = Integer.toHexString(num1).toUpperCase();
        String binary = Integer.toBinaryString(num1);
        String floatString = String.format("%.2f", num2);
        String doubleString = String.format("%.3f", num3);

        System.out.println("|" + hexa +
                new String(new char[10 - hexa.length()]).replace("\0", " ")
                + "|" + new String(new char[10 - binary.length()]).replace("\0", "0")
                + binary+ "|"+ new String(new char[10 - floatString.length()]).replace("\0", " ")
                + floatString+ "|"+doubleString+ new String(new char[10 - doubleString.length()]).replace("\0", " ")+"|");


    }
}
