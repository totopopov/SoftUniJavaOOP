import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.TreeSet;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class Palindromes {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\W+");

        TreeSet<String> data = new TreeSet<>();

        for (String s : input) {
            char[] word=s.toCharArray();
            ArrayDeque<Character> check=new ArrayDeque<>();

            for (char c : word) {
                check.push(c);
            }
            char first;
            char last;

            while (!check.isEmpty() &&((first=check.peekFirst())==(check.peekLast()))){
                if (check.size()>=2){
                    check.pop();
                    check.pollLast();
                }else {
                    break;
                }

            }
            if (check.isEmpty() || check.size()==1){
                data.add(s);
            }
        }

        System.out.printf("[%s]",String.join(", ",data));

    }

}
