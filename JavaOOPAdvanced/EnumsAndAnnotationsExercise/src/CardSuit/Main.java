package CardSuit;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:49.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");

        for (Suits suits : Suits.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s",suits.ordinal(),suits.name()));
        }

    }
}
