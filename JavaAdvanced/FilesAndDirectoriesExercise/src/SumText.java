import java.io.*;

/**
 * Created by Lenovo on 27.1.2017 г..
 */
public class SumText {

    private final static String path = "/src/resources/someOtherText.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String projectPath = System.getProperty("user.dir");

        String filepath = projectPath + path;

        File someFile = new File(filepath);

        FileReader fileReader = new FileReader(someFile);

        try {
            try (BufferedReader reader = new BufferedReader(fileReader)) {

                String line;
                long sum=0;
                while ((line=reader.readLine())!=null){
                    for (char c : line.toCharArray()) {
                       sum+=c;
                    }
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
