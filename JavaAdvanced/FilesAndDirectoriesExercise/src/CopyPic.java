import java.io.*;

/**
 * Created by Lenovo on 31.1.2017 г..
 */
public class CopyPic {

    private final static String projectPath=System.getProperty("user.dir")+"/src/resources/";
    private final static String file1Path=projectPath+"copy.jpg";
    private final static String file2Path=projectPath+"the copy of copy.jpg";

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(file1Path);



        try (FileOutputStream out = new FileOutputStream(file2Path);
             FileInputStream stream = new FileInputStream(file); ){

            int data;

            byte[] bytes=new byte[1024];

            while ( (data=stream.read(bytes))!=-1){
                out.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
