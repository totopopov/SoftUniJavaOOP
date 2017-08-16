import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Lenovo on 19.1.2017 г..
 */
public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] text=sc.nextLine().toCharArray();

        ArrayDeque<Character> data=new ArrayDeque<>();

        for (char c : text) {
            data.offer(c);
        }

        boolean isPalindrome= true;

        while (data.size()>1){
            if (!data.pop().equals(data.pollLast())){
                isPalindrome=false;
                break;
            }

        }

        System.out.println(isPalindrome);

    }
}
