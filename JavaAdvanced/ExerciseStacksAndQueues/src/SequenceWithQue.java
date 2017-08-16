import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Lenovo on 21.1.2017 г..
 */
public class SequenceWithQue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayDeque<Long> data = new ArrayDeque<>();
        data.offer(Long.parseLong(sc.nextLine()));

        for (int i = 0; i <50 ; i++) {
            data.offer(data.peek()+1);
            data.offer(2*data.peek()+1);
            data.offer(data.peek()+2);
            System.out.print(data.poll()+" ");
        }
    }

}
