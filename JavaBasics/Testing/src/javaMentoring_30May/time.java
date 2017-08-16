package javaMentoring_30May;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pool  =Integer.parseInt(scan.nextLine());
        int pipe1 =Integer.parseInt(scan.nextLine());
        int pipe2 =Integer.parseInt(scan.nextLine());
        double hours = Double.parseDouble(scan.nextLine());

        double pipe1Litres =pipe1*hours;
        double pipe2Litres =pipe2*hours;
        double litresTotal =pipe1Litres+pipe2Litres;
        double percentFull = (litresTotal/pool)*100;
        double percentpipe1 =Math.floor((pipe1Litres/litresTotal)*100);
        double percentpipe2 =Math.floor((pipe2Litres/litresTotal)*100);
        double overflow =Math.abs(litresTotal-pool);
        if(pool>litresTotal)
            System.out.printf("");            //kak da izkaram %.0f i da ima % kato text ?
        else{
            System.out.printf("For %f hours the pool overflows with %.0f liters",hours,overflow);
        }






    }
}