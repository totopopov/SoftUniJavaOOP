import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km =Integer.parseInt(scan.nextLine());
        String period =scan.nextLine();

        double taxiPriceday =0.79;
        double taxiPricenight =0.90;

        if (km<20 && period.equals("day")){
            System.out.println(0.70+(km*taxiPriceday));
        }else if(km<20){
            System.out.println(0.70+(km*taxiPricenight));
        }else if(km<100){
            System.out.println(km*0.09);
        }else {
            System.out.println(km*0.06);
        }


    }
}