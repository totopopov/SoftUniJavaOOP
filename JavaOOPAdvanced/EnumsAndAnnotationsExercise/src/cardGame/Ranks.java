package cardGame;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:54.
 */
public enum Ranks {
    ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private int power;

    private Ranks(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s",this.ordinal(),this.name());
    }
}
