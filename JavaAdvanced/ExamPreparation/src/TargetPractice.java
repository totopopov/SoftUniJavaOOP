import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Lenovo on 15.2.2017 г..
 */
public class TargetPractice {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] matrixSize = reader.readLine().split(" ");

        int nSize = Integer.parseInt(matrixSize[0]);
        int mSize = Integer.parseInt(matrixSize[1]);

        String snake = reader.readLine();
        String[] shotTokens = reader.readLine().split(" ");

        int x = Integer.parseInt(shotTokens[0]);
        int y = Integer.parseInt(shotTokens[1]);
        int radious = Integer.parseInt(shotTokens[2]);

        char[][] stairs = new char[nSize][mSize];
        List<Character>[] result2= new ArrayList[nSize];

        for (int i = 0; i < nSize; i++) {
            
        }
        
        List<List<Character>>result=new ArrayList<>();
        for (int i = 0; i < nSize; i++) {
            result.add(new ArrayList<>());
        }

        int counter = 0;
        for (int i = 0; i < nSize; i++) {
            int check = nSize % 2;
            for (int j = 0; j < mSize; j++) {
                stairs[nSize - 1 - i][(nSize - 1 - i) % 2 != check ? mSize - 1 - j : j] = snake.charAt(counter % (snake.length()));
                counter++;
            }
        }

        for (int i = 0; i < nSize; i++) {
            for (int j = 0; j < mSize; j++) {

                if (Math.pow(x - i, 2) + Math.pow(y - j, 2) <= Math.pow(radious, 2)) {
                    stairs[i][j] = ' ';
                }
            }
        }



        for (int i = 0; i < mSize; i++) {
            for (int j = 0; j < nSize; j++) {
                if (stairs[nSize - 1 - j][mSize - 1 - i] != ' ') {
                    result.get(nSize - 1 - i).add(stairs[nSize - 1 - j][mSize - 1 - i]);
                }
            }
        }

        for (List<Character> characters : result) {
            for (Character character : characters) {
                System.out.print(character);
            }
            System.out.println();
        }


        String debug = "";

    }

}
