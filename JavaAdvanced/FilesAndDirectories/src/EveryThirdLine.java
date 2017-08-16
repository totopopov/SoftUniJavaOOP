import java.io.*;
import java.util.Scanner;

public class EveryThirdLine {

    public static void main(String[] args) {

        String input = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\input.txt";
        String output = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\out.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             PrintWriter out = new PrintWriter(output)) {

            int counter = 1;

            String line = reader.readLine();

            while (line!=null){
                if (counter % 3==0){
                    out.println(line);
                }
                counter ++;
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
