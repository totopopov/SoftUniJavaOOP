import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Lenovo on 26.1.2017 г..
 */
public class Demo {

    public static void main(String[] args) {

        String path="D:\\test.txt";

        FileInputStream fis=null;

        try {
            fis=new FileInputStream(path);

            int oneByte=fis.read();

            while (oneByte>=0){
                System.out.println();
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }finally {

            try {

                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
