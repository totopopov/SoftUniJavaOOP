package ManKind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 2.3.2017 г. at 2:54.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] studentInfo=reader.readLine().split(" ");
        String studentFirstName=studentInfo[0];
        String studentSecondName=studentInfo[1];
        String studentFacultyNUmber=studentInfo[2];

        String[]workerInfo=reader.readLine().split(" ");
        String workerFirstName=workerInfo[0];
        String workerSecondName=workerInfo[1];
        double workeWeekSalary=Double.parseDouble(workerInfo[2]);
        double workerWorkingHours=Double.parseDouble(workerInfo[3]);

        try {
            Student student= new Student(studentFirstName, studentSecondName,studentFacultyNUmber);
            System.out.println(student.toString());
            Worker worker=new Worker(workerFirstName,workerSecondName, workeWeekSalary,workerWorkingHours);
            System.out.println(worker.toString());
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
