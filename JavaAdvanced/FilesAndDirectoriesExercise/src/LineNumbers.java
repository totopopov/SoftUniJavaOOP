import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lenovo on 27.1.2017 г..
 */
public class LineNumbers {
    private final static String path = "/src/resources/someText.txt";
    private final static String pathOut = "/src/resources/OutFileWithLinedNumbers.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + path;

        File someFile = new File(filePath);

        FileReader fileReader = new FileReader(someFile);


        try {
            try (BufferedReader reader = new BufferedReader(fileReader);
                 PrintWriter printWriter = new PrintWriter(projectPath+pathOut)) {

                String line;
                int counter = 1;

                while ((line=reader.readLine())!=null){

                    printWriter.println(counter+". "+line);
                    counter++;
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }







    }

}
