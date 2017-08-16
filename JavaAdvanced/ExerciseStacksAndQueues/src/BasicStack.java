import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        Integer pushE = Integer.parseInt(input[0]);

        Integer popE = Integer.parseInt(input[1]);

        Integer element = Integer.parseInt(input[2]);

        String[] numbersIn = sc.nextLine().split(" ");

        ArrayDeque<Integer> que = new ArrayDeque<>();

        for (int i = 0; i < pushE; i++) {

            que.push(Integer.parseInt(numbersIn[i]));
        }

        for (int i = 0; i < popE; i++) {

            que.pop();
        }


        if (que.contains(element)) {
            System.out.print("true");
        } else if (que.isEmpty()) {
            System.out.println(0);
        } else {

            Integer min = Integer.MAX_VALUE;

            while (!que.isEmpty()) {
                if (que.peek() < min) {
                    min = que.peek();
                }
                que.pop();
            }

            System.out.print(min);
        }


    }


}
