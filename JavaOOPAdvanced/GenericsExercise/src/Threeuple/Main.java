package Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 21:28.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input =reader.readLine().split("\\s+");

        String firstItem=input[0]+" "+input[1];
        String secondItem=input[2];

        String thirdItem=input[3];

        Threeuple<String,String,String> tuple=new ThreeupleImpl<String,String,String>(firstItem,secondItem,thirdItem);
        System.out.println(tuple);

        input =reader.readLine().split("\\s+");

        boolean drunk=false;

        if (input[2].equals("drunk")||input[2].equals("not")){
            drunk=input[2].equals("drunk");
        }

        Threeuple<String,Integer,Boolean> secondTuple=
                new ThreeupleImpl<String, Integer,Boolean>(input[0],Integer.parseInt(input[1]),drunk);

        System.out.println(secondTuple);

        input =reader.readLine().split("\\s+");


        Threeuple<String,Double,String> thirdTuple=
                new ThreeupleImpl<String, Double,String>(input[0],Double.valueOf(input[1]),input[2]);

        System.out.println(thirdTuple);
    }
}
