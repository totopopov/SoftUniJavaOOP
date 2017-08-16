import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 19.2.2017 г..
 */
public class First {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] size=reader.readLine().split(" ");

        int x= Integer.parseInt(size[0]);
        int y= Integer.parseInt(size[1]);

        int[][] matrix = new int [x][y];

        String commmand;

        while (!"Here We Go".equals(commmand=reader.readLine())){

            String[] tokens=commmand.split(" ");

            int x1=Integer.parseInt(tokens[0]);
            int y1=Integer.parseInt(tokens[1]);
            int x2=Integer.parseInt(tokens[2]);
            int y2=Integer.parseInt(tokens[3]);

            for (int i = x1; i <= x2 ; i++) {
                for (int j = y1; j <=y2 ; j++) {
                    matrix[i][j]+=1;
                }
            }

        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}
