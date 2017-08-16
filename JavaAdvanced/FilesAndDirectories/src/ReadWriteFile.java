import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Lenovo on 26.1.2017 г..
 */
public class ReadWriteFile {

    public static void main(String[] args) {

        String input = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\input.txt";
        String output = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\out.txt";

        try (FileInputStream in = new FileInputStream(input);
             FileOutputStream out = new FileOutputStream(output)) {

            int oneByte = in.read();
            while (oneByte >= 0) {
                char check=(char) oneByte;
                if (check!=',' && check!='.' && check!=',' && check!='!' && check!='?'){
                    out.write(oneByte);
                }
                oneByte = in.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }





    }

}
