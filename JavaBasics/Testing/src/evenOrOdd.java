import java.text.DecimalFormat;
import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##################");

        int n = Integer.parseInt(scanner.nextLine());

        double evensum=0;
        double evenmin=Integer.MAX_VALUE;;
        double evenmax=Integer.MIN_VALUE;
        double oddsum=0;
        double oddmin=Integer.MAX_VALUE;
        double oddmax=Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i%2==0){
                evensum+=number;

                if (number>evenmax){
                    evenmax=number;
                }
                if (number<evenmin){
                    evenmin=number;
                }
            }else {
                oddsum+=number;

                if (number>oddmax){
                    oddmax=number;
                }
                if (number<oddmin){
                    oddmin=number;
                }
            }
        }

        if (n==0){
            System.out.println("OddSum=0, OddMin=No, OddMax=No, EvenSum=0, EvenMin=No, EvenMax=No");
        } else if (n==1){
            System.out.printf("OddSum=%s, OddMin=%s, OddMax=%s, EvenSum=0, EvenMin=No, EvenMax=No",
                    format.format(oddsum),format.format(oddmin),format.format(oddmax));
        } else {
            System.out.printf("OddSum=%s, OddMin=%s, OddMax=%s, EvenSum=%s, EvenMin=%s, EvenMax=%s",
                    format.format(oddsum),format.format(oddmin),format.format(oddmax),
                    format.format(evensum),format.format(evenmin),format.format(evenmax));
        }
    }
}
