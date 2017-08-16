package Lab.Area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 20:09.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ShapeFactory shapeFactory=new ShapeFactory();

        String input=reader.readLine();

        Shape shape=shapeFactory.getShape(input);

        System.out.println(shape.getArea());
    }
}
