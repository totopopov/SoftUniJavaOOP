import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 19.6.2017 г. at 20:44.
 */
public class lili {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int years=Integer.parseInt(scanner.nextLine());

        double wandry=Double.parseDouble(scanner.nextLine());

        int gifts= Integer.parseInt(scanner.nextLine());

        int moneySum=0;
        int moneygifts=0;
        int moneygiven=10;

        for (int i = 1; i <= years; i++) {
            if (i%2==0){
                moneySum+=5*i -1;
            }else {
                moneygifts+=gifts;
            }
        }

        int sum=moneySum+moneygifts;
        double outcome=(sum-wandry);
        if (outcome>=0){
            System.out.printf("Yes! %.2f",outcome);
        } else {
            System.out.printf("No! %.2f",-outcome);
        }



    }
}
