import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Lenovo on 7.2.2017 г..
 */
public class sortOddNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(", ");

        ArrayList<Integer> data = new ArrayList<>();

        for (String s : input) {

            data.add(Integer.parseInt(s.trim()));
        }

        data.removeIf(e-> e%2!=0);

        for (int i = 0; i <data.size() ; i++) {

            System.out.print(data.get(i)+((i<data.size()-1)?", ":""));

        }

        data.sort((a,b)->a.compareTo(b));

        System.out.println();

        for (int i = 0; i <data.size() ; i++) {

            System.out.print(data.get(i)+((i<data.size()-1)?", ":""));

        }





    }

}

