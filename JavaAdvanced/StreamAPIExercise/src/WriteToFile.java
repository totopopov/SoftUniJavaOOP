import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 11.2.2017 г..
 */
public class WriteToFile {
    private final static String path = "/src/resources/";
    private final static String pathOut = "/src/resources/OutChars.txt";
    private final static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {



        List<Student> students = ReadingFile.getStudents();


        File file = new File(projectPath + path + "StudentData.xls");
        FileOutputStream outputStream = new FileOutputStream(file);

        PrintWriter print = new PrintWriter(outputStream);

        String tab = "\t";

        for (Student student : students) {
            StringBuilder sb = new StringBuilder();
            sb.append(student.getFacultyNumber()).append(tab).append(student.getFirstName()).append(tab)
                    .append(student.getLastName()).append(tab).append(student.getAge()).append(tab).append(student.getEmail())
                    .append(tab).append(student.getGroup()).append(tab).append(student.getPhone()).append(tab)
                    .append(student.getGrades().stream().map(c -> c.toString()).collect(Collectors.joining(tab)));
            print.println(sb);
        }
        print.close();


    }
}
