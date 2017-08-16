import java.util.Scanner;

public class TriangeArea {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double b = sc.nextDouble();

        Double hb=sc.nextDouble();

        Double area = getArea(b,hb);

        System.out.printf("Area = %.2f",area);


    }

    private static Double getArea(Double b, Double hb) {

        return b*hb/2;

    }


}
