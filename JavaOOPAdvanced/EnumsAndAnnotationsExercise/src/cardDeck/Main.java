package cardDeck;


/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:59.
 */
public class Main {
    public static void main(String[] args){

        for (Suits suits : Suits.values()) {
            for (Ranks ranks : Ranks.values()) {
                System.out.println(String.format("%s of %s",ranks.name(),suits.name()));
            }

        }

    }

}
