package Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 20.3.2017 г. at 21:28.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input =reader.readLine().split("\\s+");

        String firstItem=input[0]+" "+input[1];
        String secondItem=input[2];


        TupleInterface<String,String> tuple=new Tuple<String, String>(firstItem,secondItem);
        System.out.println(tuple);



        input =reader.readLine().split("\\s+");

        TupleInterface<String,Integer> secondTuple=new Tuple<String, Integer>(input[0],Integer.parseInt(input[1]));

        System.out.println(secondTuple);

        input =reader.readLine().split("\\s+");


        TupleInterface<Integer,Double> thirdTuple=
                new Tuple<Integer, Double>(Integer.parseInt(input[0]),Double.valueOf(input[1]));


        System.out.println(thirdTuple);


    }
}
