import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Lenovo on 25.1.2017 г..
 */
public class AcademyGraduation {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        TreeMap<String,Double> data = new TreeMap<>();


        for (int i = 0; i < lines; i++) {
            String name = sc.nextLine();

            String [] grades = sc.nextLine().split(" ");

            Double grade =0.0;

            for (String s : grades) {
                grade+=Double.parseDouble(s);
            }

            grade=grade/grades.length;

            data.put(name,grade);
        }

        for (Map.Entry<String, Double> entry : data.entrySet()) {
            System.out.println(entry.getKey()+" is graduated with " + entry.getValue());
        }
    }

}
