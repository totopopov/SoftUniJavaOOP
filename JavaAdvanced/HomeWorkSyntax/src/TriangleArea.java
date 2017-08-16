import com.sun.javafx.geom.Area;

import java.util.Scanner;

/**
 * Created by Lenovo on 20.1.2017 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] p1 = sc.nextLine().split(" ");
        String[] p2 = sc.nextLine().split(" ");
        String[] p3 = sc.nextLine().split(" ");

        Integer x1 = Integer.parseInt(p1[0]);
        Integer y1 = Integer.parseInt(p1[1]);
        Integer x2 = Integer.parseInt(p2[0]);
        Integer y2 = Integer.parseInt(p2[1]);
        Integer x3 = Integer.parseInt(p3[0]);
        Integer y3 = Integer.parseInt(p3[1]);

        Double area =1.0*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;

        System.out.printf("%d",Math.abs(Math.round(area)));


    }
}
