package stackIterator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 19:19.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        CustomStack<Integer> stack=new MyStack<>();

        while (!"END".equals(input=reader.readLine())){


            if (input.startsWith("Push ")){

                String[] testing = input.split("\\D+");

                Integer [] integers= Arrays.stream(input.split("\\D+")).skip(1).map(Integer::parseInt).toArray(Integer[]::new);

                for (Integer integer : integers) {
                    stack.push(integer);
                }
            } else if (input.startsWith("Pop")){
                try {
                    stack.pop();
                } catch (NullPointerException e){
                    System.out.println(e.getMessage());
                }

            }

        }

        for (Integer integer : stack) {
            System.out.println(integer);
        }

        stack.forEach(System.out::println);

    }
}
