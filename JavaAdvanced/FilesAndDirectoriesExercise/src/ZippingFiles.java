import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Lenovo on 1.2.2017 г..
 */
public class ZippingFiles {
    private final static String projectPath = System.getProperty("user.dir") + "/src/resources/";
    private final static String currentFolder = System.getProperty("user.dir") + "/src/resources";
    private final static String file1Path = projectPath + "all txt.zip";

    public static void main(String[] args) throws IOException {

        try (ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file1Path)))) {

            File file = new File(currentFolder);

            for (File item : file.listFiles()) {

                if (!item.isDirectory()) {

                    String name = item.getName();

                    if (name.substring(name.length() - 3).equals("txt")) {

                        int reading = 0;
                        out.putNextEntry(new ZipEntry(name));

                        System.out.println(name);
                        byte[] bytes = new byte[512];

                        try (FileInputStream newStream = new FileInputStream(currentFolder + "/" + name)) {

                            while (reading != -1) {

                                reading = newStream.read(bytes);

                                System.out.println(reading);

                                out.write(bytes);
                            }


                        }
                    }
                }
            }
            out.close();
        }

    }
}
