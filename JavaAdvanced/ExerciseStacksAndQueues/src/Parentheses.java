import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Lenovo on 20.1.2017 г..
 */
public class Parentheses {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toCharArray();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        String output="YES";

        for (int i = 0; i <input.length ; i++) {

            Character element = input[i];

            if (element=='[' || element=='(' || element=='{'){
                stack.push(input[i]);
            } else {
                switch (element){
                    case '}': element='{' ;break;
                    case ')': element='(' ;break;
                    case ']': element='[' ;break;
                }
                if (stack.isEmpty()){
                    output="NO";
                } else  if  (stack.pop()!=element){
                    output="NO";
                }
            }

        }


        System.out.println(output);
    }

}
