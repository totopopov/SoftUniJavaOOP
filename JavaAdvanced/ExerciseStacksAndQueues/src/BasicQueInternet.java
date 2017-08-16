import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BasicQueInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputNumbers = sc.nextLine().split(" ");
        int min = Integer.MAX_VALUE;

        Queue<Integer> queue = new ArrayDeque<>();

        int n = Integer.parseInt(inputNumbers[0]);
        int s = Integer.parseInt(inputNumbers[1]);
        int x = Integer.parseInt(inputNumbers[2]);

        for (int i = 0; i < n; i++) {
            int currentNumber = sc.nextInt();
            queue.add(currentNumber);
            if (currentNumber <= min) {
                min = currentNumber;
            }
        }

        for (int i = 0; i < s; i++) {
            queue.remove();
        }

        if (queue.contains(x)) {
            System.out.println("true");
        } else if (queue.size() == 0) {
            System.out.println("0");
        } else {
            System.out.println(min);
        }
    }
}