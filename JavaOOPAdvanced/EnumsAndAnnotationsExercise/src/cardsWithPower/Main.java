package cardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:59.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rank = reader.readLine();
        String suit = reader.readLine();
        Card cardOne=new Card(suit,rank);

        rank = reader.readLine();
        suit = reader.readLine();

        Card cardTwo=new Card(suit,rank);

        System.out.println(cardOne.compareTo(cardTwo)>0?cardOne:cardTwo);
    }

}
