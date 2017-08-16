import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) {

        String path = "asd";

        try {
            try (FileInputStream fis=new FileInputStream(path)){
                int oneByte= fis.read();

                while (oneByte>=0){
                    System.out.println(oneByte);
                    oneByte=fis.read();
                }
                fis.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
