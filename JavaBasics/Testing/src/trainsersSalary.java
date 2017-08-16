import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 19.6.2017 г. at 19:22.
 */
public class trainsersSalary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lectursNumb=Integer.parseInt(scanner.nextLine());

        double buget=Double.parseDouble(scanner.nextLine());

        double lectureBuget=buget/lectursNumb;

        double sumJ=0;
        double sumR=0;
        double sumRo=0;
        double sumT=0;
        double sumS=0;
        double sum=0;


        for (int i = 0; i < lectursNumb; i++) {

            String name=scanner.nextLine();

            switch (name){
                case "Jelev":
                    sumJ+=lectureBuget;
                    break;
                    case "RoYaL":
                        sumR+=lectureBuget;
                        break;
                case "Roli":
                    sumRo+=lectureBuget;
                    break;
                case "Trofon":
                    sumT+=lectureBuget;
                    break;
                case "Sino":
                    sumS+=lectureBuget;
                    break;
                default:
                    sum+=lectureBuget;
                    break;
            }
        }

        System.out.printf("Jelev salary: %.2f lv",sumJ);
        System.out.println();
        System.out.printf("RoYaL salary: %.2f lv",sumR);
        System.out.println();
        System.out.printf("Roli salary: %.2f lv%n",sumRo);
        System.out.printf("Trofon salary: %.2f lv%n",sumT);
        System.out.printf("Sino salary: %.2f lv%n",sumS);
        System.out.printf("Others salary: %.2f lv%n",sum);

    }
}
