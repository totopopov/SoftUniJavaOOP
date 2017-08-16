package CatLady;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 19:12.
 */
public class StreetExtraordinaire extends Cat {
    private int decibelsOfMeows;

    public StreetExtraordinaire(String name, int decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows=decibelsOfMeows;
    }


    @Override
    public String toString() {
        return String.format("%s %s %d",this.getClass().getSimpleName(),super.getName(),this.decibelsOfMeows);
    }
}
