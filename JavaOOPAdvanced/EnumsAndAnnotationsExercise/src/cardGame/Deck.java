package cardGame;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 20:58.
 */
public class Deck {
    private Map<String,Card> cards;

    public Deck() {
        this.cards = new HashMap<>();
        for (Suits suits : Suits.values()) {
            for (Ranks ranks : Ranks.values()) {
                Card card = new Card(suits.name(),ranks.name());
                cards.put(String.format("%s of %s",ranks.name(),suits.name()),card);
            }
        }
    }





}
