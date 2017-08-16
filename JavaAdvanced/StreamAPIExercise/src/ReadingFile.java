import sun.applet.Main;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * Created by Lenovo on 10.2.2017 г..
 */
public  class ReadingFile {
    public static ArrayList <Student> getStudents() throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(Main.class.getResourceAsStream("/StudentData.txt")));

        String line;

        ArrayList<String> inputData = new ArrayList<>();

        ArrayList<Student> students = new ArrayList<>();

        while ((line = reader.readLine()) != null) {

            inputData.add(line);
        }

        for (int i = 1; i < inputData.size(); i++) {

            String[] tokens = inputData.get(i).split("\\s+");

            String facultyNumber = tokens[0];
            String firstName = tokens[1];
            String lastName = tokens[2];
            String email = tokens[3];
            int age = Integer.parseInt(tokens[4]);
            int group = Integer.parseInt(tokens[5]);
            ArrayList<Integer> grades = Arrays
                    .stream(tokens).skip(6).limit(4).map(Integer::parseInt)
                    .collect(Collectors.toCollection(ArrayList::new));
            String phone = tokens[tokens.length - 1];

            Student student = new Student(facultyNumber, firstName, lastName, email, age, group, phone, grades);

            students.add(student);
        }

        return students;

    }
}
