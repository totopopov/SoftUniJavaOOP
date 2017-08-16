import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class StockSpanProblem {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int stocksNumber = Integer.parseInt(reader.readLine());

        int[] stockPrices = new int[stocksNumber];
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(0);
        sb.append("1").append(System.lineSeparator());
        stockPrices[0]=Integer.parseInt(reader.readLine());

        for (int i = 1; i < stocksNumber; i++) {
            int input = Integer.parseInt(reader.readLine());
            int counter;
            stockPrices[i] = input;

            while (!stack.isEmpty() && stockPrices[stack.peek()] <= input) {
                stack.pop();
            }
            counter=stack.isEmpty()?i+1:i-stack.peek();

            stack.push(i);
            sb.append(counter).append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}
