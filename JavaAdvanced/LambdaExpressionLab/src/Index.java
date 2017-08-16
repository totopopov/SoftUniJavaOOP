import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 14.2.2017 г..
 */
public class Index {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer size=10;
        Integer curentIndex=Integer.parseInt(reader.readLine());
        Integer offset =Integer.parseInt(reader.readLine());;
        curentIndex = ((curentIndex+offset) % size)>=0?
                ((curentIndex+offset) % size) :size+((curentIndex+offset) % size);
        System.out.println(curentIndex);


    }

}
