package customEnumAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:59.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        CardInfo annotation = null;


        if (input.equals("Rank")){
             annotation = Rank.class.getAnnotation(CardInfo.class);
        } else {
            annotation = Suits.class.getAnnotation(CardInfo.class);
        }

        System.out.println(String.format("Type = %s, Description = %s",annotation.type(),annotation.description()));


    }

}
