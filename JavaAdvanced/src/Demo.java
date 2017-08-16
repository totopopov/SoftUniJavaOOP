import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();

        String word2 = scanner.next();

        Integer num1 = scanner.nextInt();

        Double num2 = scanner.nextDouble();

        Double num3 = scanner.nextDouble();

        Integer sum = (int) (num1 + num2 + num3);

        String word3 = scanner.next();

//        System.out.printf("%s %s %s %d",word1, word2, word3, sum);

        System.out.print(word1 + " " + word2 + " " + word3 + " " + sum);

    }

}
