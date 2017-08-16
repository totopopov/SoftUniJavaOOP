package lastMeeting;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 20.7.2017 г. at 10:19.
 */
public class LetterCombination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char letterStart=scanner.nextLine().charAt(0);
        char letterEnd=scanner.nextLine().charAt(0);
        char letterNotPlaced=scanner.nextLine().charAt(0);

        int contoler=0;

        for (char i = letterStart; i <= letterEnd; i++) {
            if (letterNotPlaced==i){
                continue;
            }
            for (char j = letterStart; j <=letterEnd ; j++) {
                if (letterNotPlaced==j){
                    continue;
                }
                for (char k = letterStart; k <=letterEnd ; k++) {
                    if (letterNotPlaced==k){
                        continue;
                    }

                    String name=String.valueOf(i)+j+k+" ";
                    System.out.print(name);
                    contoler++;
                }
            }


        }
        System.out.print(contoler);
    }
}
