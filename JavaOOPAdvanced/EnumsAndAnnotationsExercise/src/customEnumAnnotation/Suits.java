package customEnumAnnotation;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:49.
 */
@CardInfo(type = "Enumeration",category = "Suit",description = "Provides suit constants for a Card class.")
public enum Suits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int power;

    Suits(int power) {
        this.power=power;
    }

    public int getPower() {
        return power;
    }
}
