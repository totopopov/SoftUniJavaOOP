import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int lenght = Integer.parseInt(sc.nextLine());

        String[] names = new String[lenght];

        for (int i = 0; i < names.length; i++) {

            names[i]=sc.nextLine();
        }

        Arrays.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

    }

}
