import java.util.Scanner;

/**
 * Created by Lenovo on 18.1.2017 г..
 */
public class FillMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");

        String type=input[1];
        
        Integer size = Integer.parseInt(input[0]);

        int[][] matrix =new int[size][size];
        int filling=1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[type.equals("A")?j:(i%2==0?j:size-j-1)][i]=filling;
                filling++;
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }


}
