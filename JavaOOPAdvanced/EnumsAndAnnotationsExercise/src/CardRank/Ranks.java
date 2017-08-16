package CardRank;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:54.
 */
public enum Ranks {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;


    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s",this.ordinal(),this.name());
    }
}
