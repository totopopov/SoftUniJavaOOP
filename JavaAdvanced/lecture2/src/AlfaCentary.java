import java.util.Scanner;

public class AlfaCentary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = new String[4];

        input[1] = sc.nextLine();
        input[2] = sc.nextLine();
        input[3] = sc.nextLine();
        input[0] = sc.nextLine();

        Double x = Double.parseDouble(input[0].split(" ")[0]);
        Double y = Double.parseDouble(input[0].split(" ")[1]);

        Double x1 = Double.parseDouble(input[1].split(" ")[1]);
        Double y1 = Double.parseDouble(input[1].split(" ")[2]);

        Double x2 = Double.parseDouble(input[2].split(" ")[1]);
        Double y2 = Double.parseDouble(input[2].split(" ")[2]);

        Double x3 = Double.parseDouble(input[3].split(" ")[1]);
        Double y3 = Double.parseDouble(input[3].split(" ")[2]);

        int movement = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= movement; i++) {

            if (Math.abs(x - x1) <= 1 && Math.abs(y - y1) <= 1) {
                System.out.println(input[1].split(" ")[0].toLowerCase());
            } else if (Math.abs(x - x2) <= 1 && Math.abs(y - y2) <= 1) {
                System.out.println(input[2].split(" ")[0].toLowerCase());
            } else if (Math.abs(x - x3) <= 1 && Math.abs(y - y3) <= 1) {
                System.out.println(input[3].split(" ")[0].toLowerCase());
            } else {
                System.out.println("space");
            }
            y+=1;
        }

    }

}
