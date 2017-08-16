import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 20.7.2017 г. at 13:23.
 */
public class Football {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int countA = 0;
        int countB = 0;
        int countV = 0;
        int countG = 0;

        for (int i = 0; i < fans; i++) {
            String ticket = scanner.nextLine();

//            switch (ticket) {
//                case "A":
//                    countA++;
//                    break;
//                case "B":
//                    countB++;
//                    break;
//                case "V":
//                    countV++;
//                    break;
//                case "G":
//                    countG++;
//                    break;
//            }


            if (ticket.equals("A")){
                countA++;
            }else if (ticket.equals("B")){
                countB++;
            }else if (ticket.equals("G")){
                countG++;
            }else {
                countV++;
            }


//            int i1 = ticket.equals("A") ? countA++ : ticket.equals("B") ?
//                    countB++ : ticket.equals("V") ? countV++ : countG++;


        }


        System.out.printf("%.2f%%%n", countA * 100.0 / fans);
        System.out.printf("%.2f%%%n", countB * 100.0 / fans);
        System.out.printf("%.2f%%%n", countV * 100.0 / fans);
        System.out.printf("%.2f%%%n", countG * 100.0 / fans);
        System.out.printf("%.2f%%%n", fans * 100.0 / stadiumCapacity);


    }
}
