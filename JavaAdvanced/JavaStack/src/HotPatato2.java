import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;



public class HotPatato2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] kids = sc.nextLine().split(" ");
        Integer rotation = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> game = new ArrayDeque<>();

        Collections.addAll(game,kids);

        Integer counter=1;

        Integer prime=1;

        while (game.size()>1){

            String currentKid=game.poll();

            if (counter % rotation==0){
                if (!isPrime(prime)){
                    System.out.println("Removed "+currentKid);
                } else {
                    System.out.println("Prime "+currentKid);
                    game.push(currentKid);
                }
                prime++;
            }else {
                game.offer(currentKid);
            }
            counter++;
        }
        System.out.println("Last is "+game.poll());
    }


    private static boolean isPrime(Integer prime) {

        if (prime<=1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (prime % i ==0){
                return false;
            }

        }

        return true;
    }

}
