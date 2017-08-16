import java.util.Scanner;

public class FibunaciRec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Long n = Long.parseLong(sc.nextLine());

        Long out= getFibunaci(n);

        System.out.println(out);

    }

    private static Long getFibunaci(Long n) {

        if (n==1 || n==0){
            return 1L;
        }
        return getFibunaci(n-1)+getFibunaci(n-2);
    }
}
