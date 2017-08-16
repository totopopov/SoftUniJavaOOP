package CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 19:11.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Cat> catData=new LinkedHashMap<>();

        String input;

        while (!"End".equals(input=reader.readLine())){
            Cat cat = CatGenerator.findCat(input);
            catData.putIfAbsent(cat.getName(),cat);
        }

        String catName=reader.readLine();

        System.out.println(catData.get(catName));


    }
}
