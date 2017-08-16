import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lenovo on 20.1.2017 г..
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] input = sc.nextLine().split(" ");

        ArrayDeque<Integer> data=new ArrayDeque<>();

        for (String s : input) {
            data.push(Integer.parseInt(s));
        }

        while (!data.isEmpty()){
            System.out.print(data.pop()+" ");
        }




    }

}
