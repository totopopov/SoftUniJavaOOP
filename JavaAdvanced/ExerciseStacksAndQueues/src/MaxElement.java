import java.util.ArrayDeque;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Integer commands = Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Integer max = Integer.MIN_VALUE;

        ArrayDeque<Integer> stackMax = new ArrayDeque<>();

        for (int i = 0; i < commands; i++) {

            String[] line = sc.nextLine().split(" ");

            if (line.length > 1) {
                stack.push(Integer.parseInt(line[1]));

                if (stackMax.isEmpty()) {
                    if (Integer.parseInt(line[1]) > max){
                        stackMax.push(Integer.parseInt(line[1]));
                    }
                } else {
                    if (stackMax.peek()<Integer.parseInt(line[1])){
                        stackMax.push(Integer.parseInt(line[1]));
                    }
                }
            }

            if (line[0].equals("2")) {

                if (stack.pop()==stackMax.peek()){
                    stackMax.pop();
                }

            }

            if (line[0].equals("3")) {

                System.out.println(stackMax.peek());

            }


        }


    }

}
