import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class PoisonousPlants {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int plantNumber = Integer.parseInt(reader.readLine());
        int[] plants = Arrays.stream(reader.readLine().split(" ")).mapToInt(i->Integer.parseInt(i)).toArray();
        int[] days=new int[plantNumber];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (int i = 1; i < plants.length ; i++) {

            int max=0;

            int check = plants[stack.peek()];
            int currentdigit=plants[i];

            while (!stack.isEmpty() && plants[stack.peek()]>=plants[i]){
                max=Math.max(max,days[stack.pop()]);
            }

            if (!stack.isEmpty()){
                days[i]=max+1;
            }
            stack.push(i);
        }
        Arrays.stream(days).max().ifPresent(s-> System.out.println(s));
    }

}
