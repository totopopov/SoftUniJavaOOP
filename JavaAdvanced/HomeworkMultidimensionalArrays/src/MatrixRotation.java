import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lenovo on 19.1.2017 г..
 */
public class MatrixRotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] inputDeg = sc.nextLine().split("\\D+");

        Integer deg = Integer.parseInt(inputDeg[1]);

        deg = deg / 90;
        deg = deg % 4;

       // System.out.println(deg);

        String input = sc.nextLine();

        ArrayList<ArrayList<Character>> data = new ArrayList<>();

        Integer counter = 0;
        Integer max = 0;


        while (!input.equals("END")) {

            data.add(new ArrayList<>());

            for (int i = 0; i < input.length(); i++) {
                data.get(counter).add(input.toCharArray()[i]);

            }
            if (max < input.length()) {
                max = input.length();
            }
            input = sc.nextLine();
            counter++;
        }


        for (ArrayList<Character> datum : data) {
            for (int i = datum.size(); i < max; i++) {
                datum.add(' ');
            }
        }
            Integer sizeC = max;
            Integer sizeL = data.size();

            Character[][] output = new Character[deg % 2 == 1 ? sizeC : sizeL][deg % 2 == 1 ? sizeL : sizeC];

            switch (deg) {
                case 1:
                    for (int i = 0; i < data.size(); i++) {
                        for (int j = 0; j < data.get(i).size(); j++) {
                            output[j][data.size()-1-i] = data.get(i).get(j);
                        }

                    }
                    break;
                case 2:
                    for (int i = 0; i < data.size(); i++) {
                        for (int j = 0; j < data.get(i).size(); j++) {
                            output[data.size()-1-i][data.get(i).size() - 1 - j] = data.get(i).get(j);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < data.size(); i++) {
                        for (int j = 0; j < data.get(i).size(); j++) {
                            output[data.get(i).size()-1-j][i] = data.get(i).get(j);
                        }

                    }
                    break;
                case 0:
                    for (int i = 0; i < data.size(); i++) {
                        for (int j = 0; j < data.get(i).size(); j++) {
                            output[i][j] = data.get(i).get(j);
                        }
                    }
                    break;
            }

            for (Character[] characters: output) {
                for (Character character : characters) {
                    System.out.print(character);
                }
                System.out.println();
            }


        }

    }
