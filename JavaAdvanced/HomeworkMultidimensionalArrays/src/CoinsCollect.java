import java.util.ArrayList;
import java.util.Scanner;

public class CoinsCollect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<String>> board = new ArrayList<>();

        inputData(sc, board);


        char[] movement = sc.nextLine().toCharArray();

        Integer x = 0;
        Integer y = 0;

        Integer coins = 0;
        Integer walls = 0;

        for (char move : movement) {

            switch (move) {
                case 'V':

                    if (x + 1 > 3) {
                        walls += 1;
                        break;
                    } else if (y>board.get(x+1).size()-1) {
                        walls += 1;
                        break;
                    } else {
                        x += 1;
                        if (board.get(x).get(y).equals("$")){
                            coins+=1;
                            break;
                        }
                    }
                    break;

                case '>':

                    if (y + 1 > board.get(x).size()-1) {
                        walls += 1;
                        break;
                    } else  {
                        y += 1;
                        if (board.get(x).get(y).equals("$")){
                            coins+=1;
                            break;
                        }
                    }
                    break;

                case '<':

                    if (y - 1 == -1) {
                        walls += 1;
                        break;
                    } else  {
                        y -= 1;
                        if (board.get(x).get(y).equals("$")){
                            coins+=1;
                            break;
                        }
                    }
                    break;

                case '^':
                    if (x - 1 == -1) {
                        walls += 1;
                        break;
                    } else if (y>board.get(x-1).size()-1) {
                        walls += 1;
                        break;
                    } else {
                        x -= 1;
                        if (board.get(x).get(y).equals("$")){
                            coins+=1;
                            break;
                        }
                    }
                    break;
            }

        }

        System.out.printf("Coins = %d",coins);
        System.out.println();
        System.out.printf("Walls = %d",walls);

    }

    public static void inputData(Scanner sc, ArrayList<ArrayList<String>> board) {
        for (int i = 0; i < 4; i++) {

            board.add(new ArrayList());
            char[] line = sc.nextLine().toCharArray();

            for (char c : line) {
                board.get(i).add(String.valueOf(c));
            }

        }
    }


}


