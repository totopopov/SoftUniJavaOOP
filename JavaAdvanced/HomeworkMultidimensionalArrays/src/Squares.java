

import java.util.Scanner;


public class Squares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] size = sc.nextLine().split(" ");

        int[]IntSize=new int[2];

        IntSize[0]=Integer.parseInt(size[0]);

        IntSize[1]=Integer.parseInt(size[1]);

        String[][]matrix= new String[IntSize[0]][IntSize[1]];


        for (int i = 0; i <IntSize[0]; i++) {
            String[] line= sc.nextLine().split(" ");
            for (int j = 0; j <IntSize[1] ; j++) {
                matrix[i][j]=(line[j]);
            }

        }

        int count=0;

        for (int i = 0; i <IntSize[0]-1; i++) {
            for (int j = 0; j <IntSize[1]-1 ; j++) {

                if (matrix[i][j].equals(matrix[i+1][j]) &&
                        matrix[i][j].equals(matrix[i+1][j+1]) &&
                        matrix[i][j].equals(matrix[i][j+1])){

                    count++;
                }

            }

        }

        System.out.println(count);

    }


}
