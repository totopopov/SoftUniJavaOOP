import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortedLines {

    public static void main(String[] args) {

        String input = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\input.txt";
        String output = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\out.txt";

        Path inpath= Paths.get(input);
        Path outpath= Paths.get(output);

        try {
            List<String> data = Files.readAllLines(inpath);
            Collections.sort(data);
            Files.write(outpath,data);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
