import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lenovo on 19.1.2017 г..
 */
public class PlusRemove {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String input = sc.nextLine();

        ArrayList<ArrayList<Character>> data = new ArrayList<>();
        ArrayList<ArrayList<Character>> outData = new ArrayList<>();

        ArrayList<ArrayList<Integer>> output = new ArrayList<>();

        Integer counter = 0;

        while (!input.equals("END")) {

            data.add(new ArrayList<>());
            output.add(new ArrayList<>());
            outData.add(new ArrayList<>());
            for (int i = 0; i < input.length(); i++) {
                data.get(counter).add(input.toLowerCase().toCharArray()[i]);
                output.get(counter).add(1);

            }
            for (int i = 0; i < input.length(); i++) {
                outData.get(counter).add(input.toCharArray()[i]);
            }

            counter++;

            input = sc.nextLine();
        }


        for (int i = 1; i < data.size() - 1; i++) {
            for (int j = 1; j < data.get(i).size() - 1; j++) {

                try {
                    char plus = data.get(i).get(j);
                    char plus1 = data.get(i - 1).get(j);
                    char plus2 = data.get(i + 1).get(j);
                    char plus3 = data.get(i).get(j - 1);
                    char plus4 = data.get(i).get(j + 1);

                    if (plus == plus1 && plus == plus2 && plus == plus3 && plus == plus4) {
                        output.get(i).set(j, 0);
                        output.get(i - 1).set(j, 0);
                        output.get(i + 1).set(j, 0);
                        output.get(i).set(j - 1, 0);
                        output.get(i).set(j + 1, 0);
                    }
                } finally {
                    continue;
                }

            }
        }

        for (int i = 0; i < output.size(); i++) {
            for (int j = output.get(i).size() - 1; j >= 0; j--) {
                if (output.get(i).get(j) == 0) {
                    outData.get(i).remove(j);
                }
            }
        }


//        for (ArrayList<Integer> datum : output) {
//            for (int character : datum) {
//                System.out.print(character);
//            }
//            System.out.println();
//        }


        for (ArrayList<Character> datum : outData) {
            for (Character character : datum) {
                System.out.print(character);
            }
            System.out.println();
        }


    }

}
