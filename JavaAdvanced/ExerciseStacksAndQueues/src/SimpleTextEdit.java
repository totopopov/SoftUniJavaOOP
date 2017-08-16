import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEdit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int commands=Integer.parseInt(sc.nextLine());

        ArrayDeque<String> edited=new ArrayDeque<>();


        edited.push("");

        for (int i = 0; i < commands; i++) {

            String[] input =sc.nextLine().split(" ");


            int command = Integer.parseInt(input[0]);

            switch (command){
                case 1:

                    String insertingText = edited.peek()+input[1];

                    edited.push(insertingText);
                    break;
                case 2:
                    String textIn = edited.peek().subSequence(0,edited.peek().length()-Integer.parseInt(input[1])).toString();
                    edited.push(textIn);
                    break;
                case 3:
                    char out = edited.peek().toCharArray()[Integer.parseInt(input[1])-1];
                    System.out.println(out);
                    break;
                case 4:
                    edited.pop();
                    break;
            }
        }
    }
}
