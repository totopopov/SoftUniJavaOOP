import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Lenovo on 19.1.2017 г..
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tokens=sc.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack,tokens);

        while (stack.size()>1){
            Integer first = Integer.parseInt(stack.pop());

            String operator= stack.pop();

            Integer second = Integer.parseInt(stack.pop());

            Integer equals = operator.equals("+")?first+second:first-second;

            stack.push(equals.toString());
        }

        System.out.println(stack.pop());


    }

}
