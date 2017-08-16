import java.util.Scanner;

/**
 * Created by Lenovo on 18.1.2017 г..
 */
public class Diagonal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer size = Integer.parseInt(sc.nextLine());

        int[][]matrix= new int[size][size];

        int sumDown=0;
        int sumUp=0;

        for (int i = 0; i <size; i++) {
          String[] line= sc.nextLine().split(" ");
            for (int j = 0; j <size ; j++) {

                matrix[i][j]=Integer.parseInt(line[j]);

                if (i==j){
                    sumDown+=Integer.parseInt(line[j]);
                }

                if (i+j==size-1){
                    sumUp+=Integer.parseInt(line[j]);
                }
            }

        }

        System.out.println(Math.abs(sumDown-sumUp));


    }


}
