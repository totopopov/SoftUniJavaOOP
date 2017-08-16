import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class MelrahShake {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input= new StringBuilder(reader.readLine());

        StringBuilder shaker=new StringBuilder(reader.readLine());

        boolean shakeIt=true;

        do {
            int first = input.indexOf(shaker.toString());
            int last = input.lastIndexOf(shaker.toString());

            if (first!=last && first>=0 && last>0 && shaker.length()>0){
                input.replace(first,first+shaker.length(),"");
                last = input.lastIndexOf(shaker.toString());
                input.replace(last,last+shaker.length(),"");
                int place=shaker.length()/2;
                shaker.deleteCharAt(place);

                System.out.println("Shaked it.");

            }else {
                shakeIt=false;
            }


        }while (shakeIt);

        System.out.println("No shake.");
        System.out.println(input);

    }

}
