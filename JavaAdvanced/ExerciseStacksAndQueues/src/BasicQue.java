import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Lenovo on 21.1.2017 г..
 */
public class BasicQue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        Integer elements = Integer.parseInt(input[0]);
        Integer pollE = Integer.parseInt(input[1]);
        Long checkThisOne = Long.parseLong(input[2]);

        ArrayDeque<Long> que = new ArrayDeque<>();

        Long minValue=Long.MAX_VALUE;

        input = sc.nextLine().split("\\s+");

        for (int i = 0; i < elements; i++) {

            que.add(Long.parseLong(input[i]));
            if (Long.parseLong(input[i])<minValue){
                minValue=Long.parseLong(input[i]);
            }
        }
        for (int i = 0; i < pollE; i++) {
            if (!que.isEmpty()) {
                que.poll();
            }
        }

        if (que.contains(checkThisOne)) {
            System.out.print("true");
        } else {
            if (que.isEmpty()) {
                System.out.print("0");
            } else {
                Long min = Long.MAX_VALUE;

                for (int i = 0; i < que.size(); i++) {
                    if (que.peek() < min) {
                        min = que.peek();
                    }
                    que.pop();
                }
                System.out.print(minValue);

            }
        }

    }

}
