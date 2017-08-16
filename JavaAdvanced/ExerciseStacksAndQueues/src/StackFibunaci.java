import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StackFibunaci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer num=Integer.parseInt(sc.nextLine());
        ArrayDeque<Long> data = new ArrayDeque<>();

        data.push(1L);
        data.push(1L);

        for (int i = 2; i <=num ; i++) {

            Long first=data.pop();

            Long second=data.peek();

            Long current = first+second;

            data.push(first);
            data.push(current);
        }

        System.out.println(data.pop());

    }

}
