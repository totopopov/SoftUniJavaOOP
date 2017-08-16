import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class SumNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        String in1=reader.readLine();
        String in2=reader.readLine();


        int maxLenght=in1.length()>=in2.length()?in1.length():in2.length();

        char[] num1 = new char[maxLenght];
        char[] num2 = new char[maxLenght];

        StringBuilder sb = new StringBuilder();
        int mind = 0;

        for (int i = 0; i < maxLenght; i++) {

            num1[maxLenght-1-i]=i<in1.length()?in1.charAt(in1.length()-1-i):'0';
            num2[maxLenght-1-i]=i<in2.length()?in2.charAt(in2.length()-1-i):'0';
        }

        for (int i = 0; i < maxLenght; i++) {
            int number1 = num1[maxLenght - i - 1] - 48;
            int number2 = num2[maxLenght - i - 1] - 48;

            mind += number1 + number2;

            sb.append(mind % 10);
            mind = mind / 10;
        }


        if (mind != 0) {
            sb.append(mind);
        }


        while (sb.charAt(sb.length()-1)=='0'){
            sb.deleteCharAt(sb.length()-1);
     }



        System.out.println(sb.reverse());

    }

}
