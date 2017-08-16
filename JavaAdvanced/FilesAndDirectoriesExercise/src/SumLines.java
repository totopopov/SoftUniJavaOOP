import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by Lenovo on 27.1.2017 г..
 */
public class SumLines {

    private final static String path= "/src/resources/someText.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String projectPath = System.getProperty("user.dir");
        String filePath= projectPath+path;

        File someFile = new File(filePath);

        FileReader fileReader = new FileReader(someFile);

        try {
            try(BufferedReader reader = new BufferedReader(fileReader)){
                String line;

                while ((line=reader.readLine())!=null){
                    int sum = 0;

                    for (char c : line.toCharArray()) {
                        sum=sum + c;
                    }

                    System.out.println(sum);

                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
