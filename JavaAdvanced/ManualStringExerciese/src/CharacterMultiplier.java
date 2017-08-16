import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class CharacterMultiplier {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] data = reader.readLine().split(" ");

        char[] word1=data[0].toCharArray();
        char[] word2=data[1].toCharArray();

        long sum=0;

        for (int i = 0; i < Math.max(word1.length,word2.length); i++) {

            sum+=(word1.length>i?word1[i]:1)*(word2.length>i?word2[i]:1);
        }

        System.out.println(sum);
    }

}
