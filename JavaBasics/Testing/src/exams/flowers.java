package exams;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 8.7.2017 г. at 15:17.
 */
public class flowers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mums=Integer.parseInt(scanner.nextLine());
        int rose=Integer.parseInt(scanner.nextLine());
        int tulips=Integer.parseInt(scanner.nextLine());

        String seasson=scanner.nextLine();

        double priceUp= scanner.nextLine().endsWith("Y")?1.15:1;
        double sum=0;
        double discount=1;

        if (tulips>7 && seasson.equals("Spring")){
            discount=discount*0.95;
        }

        if (rose>=10 && seasson.equals("Winter")){
            discount=discount*0.90;
        }

        if (rose+tulips+mums>20){
            discount=discount*0.8;
        }

        if (seasson.equals("Spring") || seasson.equals("Summer")){
            sum=(rose*4.1+mums*2+tulips*2.5)*priceUp*discount;
        }else {
            sum=(mums*3.75+rose*4.5+tulips*4.15)*priceUp*discount;
        }
        System.out.printf("%.2f",sum+2);
    }
}
