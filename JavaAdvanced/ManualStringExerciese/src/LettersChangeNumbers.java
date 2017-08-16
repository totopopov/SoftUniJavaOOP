import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class LettersChangeNumbers {

    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] input = reader.readLine().split("\\s+");

    Double sum=0.0;

        for (String s : input) {

            Double currentSum=0.0;

            char first=s.charAt(0);
            char last =s.charAt(s.length()-1);
            Double number= Double.parseDouble(s.substring(1,s.length()-1));

            if (65 <=first && first<=90){
                currentSum=number/(first-64);
            }else {
                currentSum=number*(first-96);
            }

            if (65 <=last && last<=90){
                currentSum-=(last-64);
            }else {
                currentSum+=(last-96);
            }

            sum+=currentSum;
        }

        System.out.printf("%.2f",sum);
//        System.out.println();
//        System.out.println(sum);
//        System.out.println(String.format("|%-10s|%s|%10.2f|%-10.3f|",sum,sum,sum,sum));
//        System.out.println(String.format(Locale.US, "|%-10s|%s|%10.2f|%-10.3f|",sum,sum,sum,sum));
//        System.out.println(String.format(Locale.GERMAN, "|%-10s|%s|%10.2f|%-10.3f|",sum,sum,sum,sum));
    }

}
