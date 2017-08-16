package Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 23:57.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;



        while (!"END".equals(input=reader.readLine())){

            int[] tokens = Arrays.stream(input.split("[^\\d\\-]+")).mapToInt(e->Integer.parseInt(e)).toArray();

            Lake lake=new Lake(tokens);

            System.out.println(lake);


        }





    }
}
