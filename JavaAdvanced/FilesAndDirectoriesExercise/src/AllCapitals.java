import java.io.*;

public class AllCapitals {

    private final static String path = "/src/resources/toCapital2.txt";
    private final static String pathOut = "/src/resources/OutFile.txt";

    public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath + path;
        String fileOutPath = projectPath + pathOut;

        File file = new File(filePath);

        FileReader fileReader = new FileReader(file);

        PrintWriter printWriter = new PrintWriter(fileOutPath);

        try (BufferedReader reader = new BufferedReader(fileReader)) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] inputLine = line.split(" ");

                for (int i = 0; i < inputLine.length; i++) {
                    inputLine[i] = inputLine[i].toUpperCase();
                }

                String out = String.join(" ", inputLine);

                printWriter.println(out);


            }
            printWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
