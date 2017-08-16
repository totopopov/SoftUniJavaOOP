import java.io.File;
import java.util.ArrayDeque;

/**
 * Created by Lenovo on 31.1.2017 г..
 */
public class GetFolderSize {

    private final static String projectPath=System.getProperty("user.dir")+"/src/resources/";
    private final static String file1Path=projectPath+"Files-and-Streams";
    private final static String file2Path=projectPath+"file size.text";

    public static void main(String[] args) {


        File file = new File(file1Path);

        ArrayDeque<File> tail = new ArrayDeque<>();

        tail.offer(file);

        long size = 0;

        while (!tail.isEmpty()){
            File inside = tail.poll();

            for (File files : inside.listFiles()) {
                if (files.isDirectory()){
                    tail.offer(files);
                }else {
                    size+=files.length();
                }

            }
        }
        System.out.println("Folder size: " + size);


    }


}
