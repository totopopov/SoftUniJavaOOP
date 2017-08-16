import java.util.Scanner;

public class problem5 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        long[][] pascal = new long[input][];

        for (int i = 0; i < input; i++) {
            pascal[i] = new long[i + 1];
            pascal[i][0] = 1;
            for (int j = 1; j < i ; j++) {
                if (i > 0) {
                    pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
                }
            }
            pascal[i][i] = 1;

        }

        for (long[] ints : pascal) {
            for (long anInt : ints) {
                System.out.print(anInt+ " ");
            }
            System.out.println();
        }

    }
}
