package PrepExam1;


import java.util.Scanner;

public class crown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int topSpaces = size - 2;
        int middleSpace=size-5;
        int middleDots=1;
        //topRow
        System.out.println("@" + repeatStr(" ", topSpaces)
                + "@" + repeatStr(" ", topSpaces) + "@");
        //SecondRow
        System.out.println("**"+repeatStr(" ",topSpaces-1)+
        "*"+repeatStr(" ",topSpaces-1)+"**");

        //MiddlePart
        for (int i = 1; i < size / 2; i++) {

            String star="*";

            if (i==size/2-1){
                star="";
            }



            System.out.println("*"+
            repeatStr(".",i)+star
            +repeatStr(" ",middleSpace)
            +"*"+repeatStr(".",middleDots)+
            "*"+repeatStr(" ",middleSpace)
            +star+repeatStr(".",i)+"*");
            middleSpace-=2;
            middleDots+=2;
        }

        System.out.println("*"+repeatStr(".",size/2)
        +repeatStr("*",size/2-2)+"."+
                repeatStr("*",size/2-2)+
                repeatStr(".",size/2)+"*");
        System.out.println(repeatStr("*",2*size-1));
        System.out.println(repeatStr("*",2*size-1));

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}
