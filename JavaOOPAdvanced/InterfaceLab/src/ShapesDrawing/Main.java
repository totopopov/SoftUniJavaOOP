package ShapesDrawing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Todor Popov using Lenovo on 14.3.2017 г. at 15:16.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            queue.add(Integer.parseInt(reader.readLine()));
        }

        Drawable circle = new Circle(queue.poll());
        Drawable rect = new Rectangle(queue.poll(), queue.poll());

        System.out.print(circle.draw());
        System.out.print(rect.draw());

    }
}
