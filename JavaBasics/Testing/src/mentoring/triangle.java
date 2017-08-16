package mentoring;
import java.util.Scanner;



public class triangle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int size=Integer.parseInt(scanner.nextLine());

 //     System.out.println("#################################".length());

        System.out.println(repeatStr("#",4*size+1));

        for (int i = 0; i < size; i++) {

            if (i==size/2){
                System.out.println(repeatStr(".", i + 1) + repeatStr("#", 2 * size - 1 - 2 * i)
                        + repeatStr(" ",i-1)+"(@)"+repeatStr(" ",i-1)
                        + repeatStr("#", 2 * size - 1 - 2 * i)
                        + repeatStr(".", 1 + i));
            } else {

                System.out.println(repeatStr(".", i + 1) + repeatStr("#", 2 * size - 1 - 2 * i)
                        + repeatStr(" ", 1 + 2 * i)
                        + repeatStr("#", 2 * size - 1 - 2 * i)
                        + repeatStr(".", 1 + i));
            }
        }


    }

    public static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}
