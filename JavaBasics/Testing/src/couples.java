import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 19.6.2017 г. at 19:01.
 */
public class couples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int maxDiff=0;
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int sum= firstNum+secondNum;


        for (int i = 0; i < n-1; i++) {
            int currentFirst=Integer.parseInt(scanner.nextLine());
            int currentSecond=Integer.parseInt(scanner.nextLine());
            int currentSum=currentFirst+currentSecond;
            int currentDiff=Math.abs(currentSum-sum);

            if (currentDiff>maxDiff){
                maxDiff=currentDiff;
            }

            sum=currentSum;
        }

        if (maxDiff==0){
            System.out.printf("Yes, value=%d",sum);
        }else {
            System.out.printf("No, maxdiff=%d",maxDiff);
        }
    }
}
