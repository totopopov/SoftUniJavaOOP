import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Lenovo on 19.1.2017 г..
 */
public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer input=Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        do {

            binary.push(input % 2);
            input=input /2 ;
        }while (input!=0);

        while (!binary.isEmpty()){
            System.out.print(binary.pop());
        }



    }

}
