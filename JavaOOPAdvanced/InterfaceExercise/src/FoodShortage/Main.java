package FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 17.3.2017 г. at 19:15.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Buyer> data=new LinkedHashMap();

        int inputs = Integer.parseInt(reader.readLine());

        for (int i = 0; i < inputs; i++) {

            String[] tokens=reader.readLine().split(" ");

            String name=tokens[0];
            int age=Integer.parseInt(tokens[1]);

            if (tokens.length==4){
                Buyer person= new Citizen(name,age,tokens[2],tokens[3]);
                data.putIfAbsent(name,person);
            }else {
                Buyer rebel= new Rebel(name,age,tokens[2]);
                data.putIfAbsent(name,rebel);
            }
        }

        String input;

        while (!"End".equals(input=reader.readLine())){

            if (data.containsKey(input)){
                data.get(input).BuyFood();
            }

        }

        System.out.println(data.entrySet().stream().mapToInt(r -> r.getValue().getFood()).sum());

    }
}
