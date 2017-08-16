import java.io.*;
import java.util.ArrayList;

/**
 * Created by Lenovo on 31.1.2017 г..
 */
public class SerCourse {
    private final static String projectPath = System.getProperty("user.dir") + "/src/resources/";
    private final static String file1Path = projectPath + "Course.ser";

    public static void main(String[] args) throws IOException {


        FileOutputStream out = new FileOutputStream(file1Path);


        try (ObjectOutputStream stream = new ObjectOutputStream(out);
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file1Path))) {

            Course course = new Course();

            course.name = "Java";

            course.studetns = 110;

            stream.writeObject(course);

            Course newCorse = (Course) in.readObject();

            System.out.println("It's  a course for " + newCorse.name + " with " + newCorse.studetns + " students.");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
