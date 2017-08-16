package MooD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 0:25.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        String[] strings = reader.readLine().split(" \\| ");

        String type = strings[1];

        String name =strings[0];

        int level = Integer.parseInt(strings[3]);

        switch (type){
            case "Archangel":
                ArchangelAble archangelAble=new Archangel(name,level,Integer.parseInt(strings[2]));
                System.out.println(archangelAble);
                break;
            case "Demon":
                DemonAble demonAble=new Demon(name,level,Double.parseDouble(strings[2]));
                System.out.println(demonAble);
                break;
        }



    }
}
