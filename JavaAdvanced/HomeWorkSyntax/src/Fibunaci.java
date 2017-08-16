import java.util.Scanner;

public class Fibunaci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer n = Integer.parseInt(sc.nextLine());

        Long first=1L;

        Long second=0L;

        Long out=1L;

        for (int i = 1; i <=n ; i++) {

            out=first+second;

            second=first;

            first=out;

        }

            System.out.println(out);

    }

}
