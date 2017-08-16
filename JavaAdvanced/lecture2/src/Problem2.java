import java.util.Scanner;

/**
 * Created by Lenovo on 17.1.2017 г..
 */
public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");

        int[][] matrix = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            String[] line = sc.nextLine().split(", ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
                sum += matrix[i][j];
            }
        }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }

}
