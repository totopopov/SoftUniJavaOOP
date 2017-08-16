import java.util.Scanner;

// May be we need to restrict the bomb when its at the end of the string!
public class TerroristsWin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] data = sc.nextLine().toCharArray();

        Integer bombL = 0;
        Integer bombR = 0;
        String bombP = "";
        Integer power = 0;
        for (int i = 0; i < data.length; i++) {

            if (data[i] == '|') {
                bombL = i + 1;

                for (int j = bombL; j < data.length; j++) {
                    if (data[j] == '|') {
                        bombR = j;

                        for (int k = bombL; k < bombR; k++) {
                            bombP += data[k];
                        }

                        power = 0;
                        for (char c : bombP.toCharArray()) {
                            power += (int) c;
                        }
                        power = power % 10;

                        for (int k = Math.max(bombL - power-1,0); k <= Math.min(bombR + power,data.length-1) ; k++) {
                            data[k] = '.';

                        }
                        power = j - i + power;
                        bombP="";
                        break;
                    }

                }

                i = i + power;
            }


        }

        for (char datum : data) {
            System.out.print(datum);
        }
    }
}