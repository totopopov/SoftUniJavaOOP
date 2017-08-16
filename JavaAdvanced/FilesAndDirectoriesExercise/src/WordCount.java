import java.io.*;
import java.util.*;

public class WordCount {

    private final static String path = "/src/resources/someText.txt";
    private final static String pathMatch = "/src/resources/someTextToMatchFrom.txt";
    private final static String pathOut = "/src/resources/ContainingWords.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + path;
        String matchfile = projectPath + pathMatch;
        File someFile = new File(filePath);
        File matchFile = new File(matchfile);

        FileReader fileReader = new FileReader(someFile);
        FileReader fileReader2 = new FileReader(matchFile);


        try {
            try (BufferedReader reader = new BufferedReader(fileReader);
                 BufferedReader reader2 = new BufferedReader(fileReader2);
                 PrintWriter printWriter = new PrintWriter(projectPath+pathOut)) {

                String line;

                HashMap<String,Integer> data = new HashMap<>();
                HashMap<String,String> wordsConn = new HashMap<>();

                while ((line=reader2.readLine())!=null){

                    String[] matchingWords = line.split(" ");
                    for (String word : matchingWords) {
                        data.put(word, 0);

                    }
                }

                while ((line=reader.readLine())!=null){

                    String[] words=line.split(" ");

                    for (String word : words) {
                         if (data.containsKey(word)){
                             data.put(word, data.get(word)+1);
                         }
                    }

                }


                data.entrySet().stream().sorted( (e1,e2) -> e2.getValue()
                        .compareTo(e1.getValue())).forEach(pair->printWriter.println(pair.getKey()+" - "+pair.getValue()));



            //   Map<String, Integer> sortedMap =
            //           data.entrySet().stream()
            //                   .sorted(Map.Entry.comparingByValue())
            //                   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            //                           (e1, e2) -> e2.compareTo(e1), LinkedHashMap::new));

            //   for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {

            //       printWriter.println(entry.getKey()+" - "+entry.getValue());

               //}

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }



}
