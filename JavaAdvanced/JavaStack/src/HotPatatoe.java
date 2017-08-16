import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;



public class HotPatatoe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] kids = sc.nextLine().split(" ");
        Integer rotation = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> game = new ArrayDeque<>();

        Collections.addAll(game,kids);

        Integer counter=1;

        while (game.size()>1){

           String currentKid=game.poll();


            if (counter % rotation==0){
                System.out.println("Removed "+currentKid);
            }else {
                game.offer(currentKid);
            }

            counter++;

        }

        System.out.println("Last is "+game.poll());

    }

}
