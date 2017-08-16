import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by Lenovo on 19.2.2017 г..
 */
public class Problem2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(reader.readLine());

        ArrayDeque<ArrayDeque<Integer>> data = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lines; i++) {

            String[] waves = reader.readLine().split(" ");

            data.offer(new ArrayDeque<>());

            int currentMax=Integer.parseInt(waves[0]);
            data.peekLast().offer(Integer.parseInt(waves[0]));
            for (int j = 1; j < waves.length; j++) {

                if (Integer.parseInt(waves[j])>currentMax) {
                    data.peekLast().offer(Integer.parseInt(waves[j]));
                    currentMax=Integer.parseInt(waves[j]);
                }
            }

        }

        String debug="";

        int counter=0;

        while (!data.isEmpty()){

            sb.append(data.peek().poll()).append(" ");
            counter++;
            if (!data.peek().isEmpty()){
                data.offer(data.poll());

            }else {
                data.poll();
            }
        }

        System.out.println(counter);
        System.out.println(sb);
    }

}
