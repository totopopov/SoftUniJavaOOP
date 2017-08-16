import java.io.*;
import java.util.ArrayDeque;



public class NestedFolders {

    public static void main(String[] args) {

        String input = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\Files-and-Streams";
        String output = "C:\\Users\\Lenovo\\Desktop\\SoftUni\\Java\\out.txt";


        File file = new File(input);

        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(file);

        int counter = 0;

        while (!queue.isEmpty()) {

            File inside = queue.poll();

            System.out.println(inside.getName());

            for (File childs : inside.listFiles()) {
                if (childs.isDirectory()){
                    queue.offer(childs);
                }

            }

            counter++;
        }
        System.out.println(counter + " folders");

    }

}

