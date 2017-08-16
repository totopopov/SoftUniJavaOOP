import java.util.Scanner;

/**
 * Created by Lenovo on 18.1.2017 г..
 */
public class MaxSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] size = sc.nextLine().split(" ");

        int[]IntSize=new int[2];

        IntSize[0]=Integer.parseInt(size[0]);

        IntSize[1]=Integer.parseInt(size[1]);

        int[][]matrix= new int[IntSize[0]][IntSize[1]];


        for (int i = 0; i <IntSize[0]; i++) {
            String[] line= sc.nextLine().split(" ");
            for (int j = 0; j <IntSize[1] ; j++) {

                matrix[i][j]=Integer.parseInt(line[j]);

            }

        }

        Integer sum = Integer.MIN_VALUE;

        Integer starti=0;
        Integer startj=0;

        for (int i = 0; i <IntSize[0]-2; i++) {
            for (int j = 0; j <IntSize[1]-2 ; j++) {
                Integer currenSum=0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l <3 ; l++) {
                        currenSum+=matrix[i+k][j+l];
                    }


                }

                if (currenSum >sum){

                    sum=currenSum;
                    starti=i;
                    startj=j;
                }

            }

        }

        System.out.println("Sum = "+sum);

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l <3 ; l++) {
                System.out.printf("%d ",matrix[starti+ k][startj+l]);
            }
            System.out.println();
        }

    }


}
