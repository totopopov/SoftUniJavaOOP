import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Lenovo on 26.1.2017 г..
 */
public class CopyBites {

    public static void main(String[] args) {

        String input = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\input.txt";
        String output = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\out.txt";

        try (FileInputStream in = new FileInputStream(input);
             FileOutputStream out = new FileOutputStream(output)) {

            int oneByte = in.read();
            while (oneByte >= 0) {
                char check=(char) oneByte;
                if (check!=' ' && check!='\n'){
                    char[] exitPut = String.valueOf(oneByte).toCharArray();
                    for (char c : exitPut) {
                        out.write(c);
                    }
                }else {
                    out.write(oneByte);
                }
                oneByte = in.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }





    }

}
