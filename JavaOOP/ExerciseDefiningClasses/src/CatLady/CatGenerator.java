package CatLady;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 19:27.
 */
public class CatGenerator {

    public static Cat findCat(String input) {

        String[] tokens=input.split(" ");

        switch (tokens[0]){
            case "StreetExtraordinaire":
                return new StreetExtraordinaire(tokens[1],Integer.parseInt(tokens[2]));
            case "Cymric":
                return new Cymric(tokens[1],Double.parseDouble(tokens[2]));
            case "Siamese":
                return new Siamese(tokens[1],Integer.parseInt(tokens[2]));
            default:
                return null;
        }

    }
}
