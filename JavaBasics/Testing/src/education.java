import java.util.Scanner;

public class education {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int v = Integer.parseInt(console.nextLine());
        int p1 = Integer.parseInt(console.nextLine());
        int p2 = Integer.parseInt(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        double v1 = ((p1 + p2) * h);
        double v111 = (100.0 * v1 / v);
        double p11 = (p1 * 1.0 / (p1 + p2)) * 100;
        double p21 = (p2 * 1.0 / (p1 + p2)) * 100;
        double v2 = v1 - v;
        if (v1 <= v) {
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", Math.floor( v111), Math.floor( p11), Math.floor( p21));
        } else if (h==Math.floor(h)){
            System.out.printf("For %.0f hours the pool overflows with %.1f liters.", h, v2);
        } else {
            System.out.printf("For %s hours the pool overflows with %.1f liters.", h, v2);
        }
    }
}