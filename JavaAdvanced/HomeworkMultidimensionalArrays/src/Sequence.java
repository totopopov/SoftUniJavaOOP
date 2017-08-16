import java.util.Scanner;


public class Sequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] size = sc.nextLine().split(" ");

        int[] intSize = new int[2];

        intSize[0] = Integer.parseInt(size[0]);

        intSize[1] = Integer.parseInt(size[1]);

        String[][] matrix = new String[intSize[0]][intSize[1]];


        for (int i = 0; i < intSize[0]; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < intSize[1]; j++) {
                matrix[i][j] = (line[j]);
            }

        }

        Integer max = 0;
        Integer currentMax = 1;
        String maxElement = "";

        for (int i = 0; i < intSize[0]; i++) {
            currentMax=1;
            for (int j = 1; j < intSize[1]; j++) {
                if (matrix[i][j].equals(matrix[i][j - 1])) {
                    currentMax++;

                    if (currentMax >= max) {
                        maxElement = matrix[i][j - 1];
                        max=currentMax;
                    }
                } else {
                    currentMax=1;
                }

            }
        }


        for (int i = 0; i < intSize[1]; i++) {
            currentMax=1;
            for (int j = 1; j < intSize[0]; j++) {
                if (matrix[j][i].equals(matrix[j-1][i])) {
                    currentMax++;

                    if (currentMax >= max) {
                        maxElement = matrix[j-1][i];
                        max=currentMax;
                    }
                } else {
                    currentMax=1;
                }

            }
        }

        currentMax=1;

        for (int i = 1; i < Math.min(intSize[1],intSize[0]); i++) {
            if (matrix[i][i].equals(matrix[i-1][i - 1])) {
                currentMax++;

                if (currentMax >= max) {
                    maxElement = matrix[i-1][i - 1];
                    max=currentMax;
                }
            } else {
                currentMax=1;
            }

        }

        Integer smallSide=Math.min(intSize[1],intSize[0]);

        for (int i = 1; i < smallSide; i++) {
            if (matrix[smallSide-i-1][i].equals(matrix[smallSide-i][i - 1])) {
                currentMax++;

                if (currentMax >= max) {
                    maxElement = matrix[smallSide-i-1][i - 1];
                    max=currentMax;
                }
            } else {
                currentMax=1;
            }

        }

        for (int i = 0; i < max; i++) {
            System.out.print(maxElement+", ");
        }

    }


}
