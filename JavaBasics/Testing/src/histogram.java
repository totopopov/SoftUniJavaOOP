import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 19.6.2017 г. at 20:31.
 */
public class histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int count2=0;
        int count3=0;
        int count4=0;


        for (int i = 0; i < n; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());

            if (currentNum%2==0){
                count2+=1;
            }
            if (currentNum%3==0){
                count3++;
            }
            if (currentNum%4==0){
                count4=count4+1;
            }
        }

        double percent2=(count2*1.0/n)*100;
        double percent3=(count3*1.0/n)*100;
        double percent4=(count4*1.0/n)*100;

        System.out.printf("%.2f%%",percent2);
        System.out.println();
        System.out.printf("%.2f%%",percent3);
        System.out.println();
        System.out.printf("%.2f%%",percent4);
        System.out.println();


    }
}
