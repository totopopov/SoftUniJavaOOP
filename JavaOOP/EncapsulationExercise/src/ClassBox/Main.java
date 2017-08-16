package ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by Todor Popov using Lenovo on 24.2.2017 г. at 19:13.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader lupa = new BufferedReader(new InputStreamReader(System.in));

//        Class boxClass = Box.class;
//        Field[] fields = boxClass.getDeclaredFields();
//        System.out.println(Arrays.asList(fields)
//                .stream()
//                .filter(f -> Modifier.isPrivate(f.getModifiers())).count());

         double lenght=Double.parseDouble(lupa.readLine());
         double width=Double.parseDouble(lupa.readLine());
         double height=Double.parseDouble(lupa.readLine());

         Box box = new Box(lenght,width,height);

        System.out.println(String.format("Surface Area - %.2f",box.getSurfaceArea()));
        System.out.println(String.format("Lateral Surface Area - %.2f",box.getLateralSurface()));
        System.out.println(String.format("Volume - %.2f",box.getVolume()));

    }

}
