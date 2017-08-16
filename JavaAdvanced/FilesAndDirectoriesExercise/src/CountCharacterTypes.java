import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CountCharacterTypes {

    private final static String path = "/src/resources/countChahrs.txt";
    private final static String pathOut = "/src/resources/OutChars.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + path;

        File someFile = new File(filePath);

        FileReader fileReader = new FileReader(someFile);



        try {
            try (BufferedReader reader = new BufferedReader(fileReader);
                 PrintWriter printWriter = new PrintWriter(projectPath+pathOut)) {

                char[] line = reader.readLine().toCharArray();

                int vowelsCount = 0;
                int consonantsCount = 0;
                int punctuationCout = 0;

                ArrayList<Character> vowels=new ArrayList<>();
                vowels.addAll(Arrays.asList('a','e','i','o','u'));
                ArrayList<Character> punctuation=new ArrayList<>();
                punctuation.addAll(Arrays.asList('!','?','.',','));

                for (char c : line) {
                    if (c==' '){
                        continue;
                    } else if(vowels.contains(c)){
                        vowelsCount++;
                    } else if (punctuation.contains(c)){
                        punctuationCout++;
                    }else {
                        consonantsCount++;
                    }
                }



                printWriter.println("Vowels: "+vowelsCount);
                printWriter.println("Consonants: "+punctuationCout);
                printWriter.println("Punctuation: "+punctuationCout);
             //   printWriter.close();

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


}
