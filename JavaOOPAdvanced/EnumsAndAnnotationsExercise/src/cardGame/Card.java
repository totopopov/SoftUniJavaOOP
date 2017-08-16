package cardGame;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 19:04.
 */
public class Card implements Comparable<Card> {
    private Suits suits;
    private Ranks ranks;

    public Card(String suits, String ranks) {
        this.suits = Suits.valueOf(suits.toUpperCase());
        this.ranks = Ranks.valueOf(ranks.toUpperCase());
    }

    public int calculateCardPower(){
        return this.suits.getPower()+this.ranks.getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s",this.ranks.name(),this.suits.name());
    }

    @Override
    public int compareTo(Card otherCard) {
        return this.calculateCardPower()-otherCard.calculateCardPower();
    }
}
