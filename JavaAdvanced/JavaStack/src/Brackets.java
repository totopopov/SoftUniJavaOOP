import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Lenovo on 19.1.2017 г..
 */
public class Brackets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toCharArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {

            if (input[i]=='('){
                stack.push(i);
            } else if(input[i]==')'){

                for (int j = stack.pop(); j <=i ; j++) {
                    System.out.print(input[j]);
                }

                System.out.println();

            }

        }
    }


}



