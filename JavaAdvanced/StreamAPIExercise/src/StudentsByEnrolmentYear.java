import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 10.2.2017 г..
 */
public class StudentsByEnrolmentYear {
    public static void main(String[] args) throws IOException {


        List<Student> students= ReadingFile.getStudents();

        Map<Integer,List<Student>> studentsByYear= students.stream()
                .collect(Collectors.groupingBy(s->Integer.parseInt(s.getFacultyNumber().substring(s.getFacultyNumber().length()-2))));



        studentsByYear.entrySet().stream().sorted((s1,s2)->s1.getKey().compareTo(s2.getKey())).forEach(c-> {
            System.out.println("20"+c.getKey()+":");
            c.getValue().stream()
                    .sorted((s1,s2)->(s1.getFirstName()+s1.getLastName()).compareTo(s2.getFirstName()+s2.getLastName()))
                    .forEach(s-> System.out.println( "-- " +s.getFirstName()+" "+s.getLastName()));
        });



    }
}
