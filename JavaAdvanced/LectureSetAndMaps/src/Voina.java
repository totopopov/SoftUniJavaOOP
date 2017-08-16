import java.util.*;

public class Voina {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Integer> player1 = new LinkedHashSet<>();

        LinkedHashSet<Integer> player2 = new LinkedHashSet<>();


        String[] playercards = sc.nextLine().split("\\s+");

        for (String playercard : playercards) {
            player1.add(Integer.parseInt(playercard));
        }

        playercards = sc.nextLine().split(" ");

        for (String playercard : playercards) {
            player2.add(Integer.parseInt(playercard));
        }

        boolean empty = false;

        for (int i = 0; i < 50; i++) {

            if (player1.isEmpty() || player2.isEmpty()) {
                empty = true;
                break;
            }

            int card1 = player1.iterator().next();
            player1.remove(card1);

            int card2 = player2.iterator().next();
            player2.remove(card2);
            int round = card1 - card2;

            if (round > 0) {
                player1.add(card1);
                player1.add(card2);
            } else if (round < 0) {
                player2.add(card1);
                player2.add(card2);
            }

        }
        if (player1.size() > player2.size()) {
            System.out.println("First player win!");
        } else if (player1.size() < player2.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }


    }


}
