import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");

        int[][] matrix = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        int sum = Integer.MIN_VALUE;

        int starti=-1;

        int startj=-1;

        for (int i = 0; i < matrix.length; i++) {
            String[] line = sc.nextLine().split(", ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }


        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {

                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (currentSum > sum) {
                   sum=currentSum;
                   starti=i;
                   startj=j;
                }
            }
        }

        System.out.println(matrix[starti][startj] + " " + matrix[starti][startj+1]);
        System.out.println(matrix[starti+1][startj] + " " + matrix[starti+1][startj+1]);
        System.out.println(sum);
    }

}