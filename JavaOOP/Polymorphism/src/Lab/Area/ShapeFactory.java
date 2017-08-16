package Lab.Area;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 23:32.
 */
public class ShapeFactory {

    public Shape getShape(String input){

        String[] tokens=input.split(" ");

        switch (tokens.length){
            case 1: return new Square(Integer.parseInt(tokens[0]));
            case 2: return new Rectangle(Double.parseDouble(tokens[0]),Double.parseDouble(tokens[1]));
            default:
                return null;
        }

    }


}
