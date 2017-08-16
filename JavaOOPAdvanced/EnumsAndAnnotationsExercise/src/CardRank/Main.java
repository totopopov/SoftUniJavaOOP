package CardRank;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:55.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        for (Ranks ranks : Ranks.values()) {
            System.out.println(ranks);
        }
    }
}
