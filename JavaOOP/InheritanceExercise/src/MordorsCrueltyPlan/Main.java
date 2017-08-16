package MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 0:40.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stomach stomachOfGandalf=new Stomach();

        String[] foods=reader.readLine().trim().toLowerCase().split("\\s+");

        for (String s : foods) {
            Food food=new Food(s);
            stomachOfGandalf.addFood(food);
        }


        System.out.println(stomachOfGandalf.calculateHappiness());
        System.out.println(stomachOfGandalf.getMood());
    }
}
