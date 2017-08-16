package mentoring;

import java.util.Scanner;

/**
 * Created by Todor Popov using Lenovo on 30.6.2017 г. at 17:20.
 */
public class stop {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        int size = Integer.parseInt(sca.nextLine());
        StringBuilder sb = new StringBuilder();

        sb.append(repeatStr(".",size+1)
                +repeatStr("_",2*size+1)
                +repeatStr(".",size+1)).append(System.lineSeparator());

        for (int i = 0; i <= size ; i++) {


            if (i==size){
                sb.append(repeatStr(".",size-i)+
                        "//"+repeatStr("_",size-3+i)+
                        "STOP!"+repeatStr("_",size-3+i)+
                        "\\\\"+repeatStr(".",size-i)).append(System.lineSeparator());
            }else {
                sb.append(repeatStr(".",size-i)+
                        "//"+repeatStr("_",2*size-1+2*i)+
                        "\\\\"+repeatStr(".",size-i)).append(System.lineSeparator());
            }
        }

        for (int i = size; i > 0 ; i--) {
            sb.append(repeatStr(".",size-i)+
                        "\\\\"+repeatStr("_",2*size-1+2*i)+
                        "//"+repeatStr(".",size-i)).append(System.lineSeparator());
        }

        System.out.println(sb.toString());
        String data= "4*n+3";

    }
    static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb=new StringBuilder("");

        for (int i = 0; i < count; i++) {
            sb = sb.append(strToRepeat);
        }

        return sb.toString();
    }
}
