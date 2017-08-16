import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Lenovo on 19.1.2017 г..
 */
public class MatrixShuffling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] size = sc.nextLine().split(" ");

        Integer lSize = Integer.parseInt(size[0]);

        Integer cSize = Integer.parseInt(size[1]);

        String[][] matrix = new String[lSize][cSize];


        for (int i = 0; i < lSize; i++) {
            String[] matrixIn = sc.nextLine().split(" ");
            for (int j = 0; j < cSize; j++) {
                matrix[i][j] = matrixIn[j];
            }
        }


        String input = sc.nextLine();

        while (!input.equals("END")) {

            String[] splitIn = input.split(" ");

            if (!splitIn[0].equals("swap") || splitIn.length != 5) {
                System.out.println("Invalid input!");
            } else if (Integer.parseInt(splitIn[1]) > lSize
                    || Integer.parseInt(splitIn[1]) < 0
                    || Integer.parseInt(splitIn[3]) > lSize
                    || Integer.parseInt(splitIn[3]) < 0
                    || Integer.parseInt(splitIn[2]) > cSize
                    || Integer.parseInt(splitIn[2]) < 0
                    || Integer.parseInt(splitIn[4]) > cSize
                    || Integer.parseInt(splitIn[4]) < 0) {

                System.out.println("Invalid input!");
            } else {

                String swap = matrix[Integer.parseInt(splitIn[1])][Integer.parseInt(splitIn[2])];
                matrix[Integer.parseInt(splitIn[1])][Integer.parseInt(splitIn[2])] = matrix[Integer.parseInt(splitIn[3])][Integer.parseInt(splitIn[4])];
                matrix[Integer.parseInt(splitIn[3])][Integer.parseInt(splitIn[4])] = swap;

                for (String[] strings : matrix) {
                    for (String string : strings) {
                        System.out.print(string + " ");
                    }
                    System.out.println();
                }

            }


            input = sc.nextLine();
        }
    }
}

