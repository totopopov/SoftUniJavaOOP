import java.io.*;

/**
 * Created by Lenovo on 27.1.2017 г..
 */
public class MergeTwoFiles {

    private final static String projectPath=System.getProperty("user.dir")+"/src/resources/";
    private final static String file1Path=projectPath+"merge1.txt";
    private final static String file2Path=projectPath+"merge2.txt";
    private final static String file3Path=projectPath+"merged.txt";

    public static void main(String[] args) throws FileNotFoundException {

        File merge1=new File(file1Path);
        File merge2=new File(file2Path);


        FileReader file1=new FileReader(merge1);
        FileReader file2=new FileReader(merge2);

        try (BufferedReader reader=new BufferedReader(file1);
             BufferedReader read2=new BufferedReader(file2);
             PrintWriter print=new PrintWriter(file3Path)){

            String in1="";

            while (null!=(in1=reader.readLine())){
                print.println(in1);
            }
            in1="";
            while (null!=(in1=read2.readLine())){
                print.println(in1);
            }

            print.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
