import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Collections;


public class ListFiles {

    public static void main(String[] args) {

        String input = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\Files-and-Streams";
        String output = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\out.txt";

        Path inpath = Paths.get(input);
        Path outpath = Paths.get(output);

        File file = new File(input);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files)
                    if (!f.isDirectory()) {
                        System.out.println(f.getName()+": "+ f.length());
                    }
            }
        }

    }

}
