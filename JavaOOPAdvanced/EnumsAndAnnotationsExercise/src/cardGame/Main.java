package cardGame;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 24.3.2017 г. at 18:59.
 */
public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map <String,Boolean> cards = new HashMap<>();

        for (Suits suits : Suits.values()) {
            for (Ranks ranks : Ranks.values()) {
                cards.put(String.format("%s of %s",ranks.name(),suits.name()),true);
            }
        }

        String firstPlayer=reader.readLine();
        String secondPlayer=reader.readLine();

        List<Card> firstPlayerCards=new ArrayList<>();
        List<Card> secondPlayerCards=new ArrayList<>();


        String inputCard;

        dealCards(reader, cards, firstPlayerCards);
        dealCards(reader, cards, secondPlayerCards);

        int firstPlayerScore = firstPlayerCards.stream().mapToInt(c -> c.calculateCardPower()).max().orElse(0);
        int secondPlayerScore = secondPlayerCards.stream().mapToInt(c -> c.calculateCardPower()).max().orElse(0);

        String winner;
        String winningCard;

        if (firstPlayerScore>secondPlayerScore){
            winner=firstPlayer;
            winningCard=firstPlayerCards.stream().sorted(Comparator.reverseOrder()).limit(1).map(Card::toString).collect(Collectors.joining(" "));
        }else {
            winner=secondPlayer;
            winningCard=secondPlayerCards.stream().sorted(Comparator.reverseOrder()).limit(1).map(Card::toString).collect(Collectors.joining(" "));
        }
        System.out.println(String.format("%s wins with %s.",winner,winningCard));

    }

    public static void dealCards(BufferedReader reader, Map<String, Boolean> cards, List<Card> playerCards) throws IOException {
        String inputCard;
        int cardsInHand=0;
        do {
            inputCard=reader.readLine();
            if (cards.containsKey(inputCard) && cards.get(inputCard)){
                String[] tokens = inputCard.split(" ");
                Card card=new Card(tokens[2],tokens[0]);
               playerCards.add(card);
                cards.put(inputCard,false);
                cardsInHand++;
            } else if (cards.containsKey(inputCard)){
                System.out.println("Card is not in the deck.");
            } else {
                System.out.println("No such card exists.");
            }

        }while (cardsInHand<5);

    }

}
