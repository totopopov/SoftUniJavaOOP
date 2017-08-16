import java.io.*;
import java.util.Scanner;

public class ExctractNtegers {

    public static void main(String[] args) {

        String input = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\input.txt";
        String output = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\out.txt";

        try (Scanner scIn = new Scanner(new FileInputStream(input));
             PrintWriter out = new PrintWriter(output)) {

            boolean hasNext = scIn.hasNext();

            while (hasNext) {
                if (scIn.hasNextInt()) {
                    int number = scIn.nextInt();
                    out.println(number);
                }
                scIn.next();
                hasNext = scIn.hasNext();
            }
        } catch (
                IOException e)

        {
            System.out.println(e.getMessage());

        }


    }

}
