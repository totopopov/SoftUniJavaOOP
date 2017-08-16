import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Lenovo on 19.1.2017 г..
 */
public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      char[] input = sc.nextLine().toCharArray();

        ArrayDeque<Character> stack= new ArrayDeque<>();

        for (char c : input) {
            stack.push(c);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }



    }

}
