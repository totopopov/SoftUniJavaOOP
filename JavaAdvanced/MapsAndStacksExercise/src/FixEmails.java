import java.util.Scanner;

public class FixEmails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       String nameIn= sc.nextLine();

       while (!("stop").equals(nameIn)){

           String email = sc.nextLine();

           char[] check = email.toLowerCase().toCharArray();

           if (check[check.length-2]=='u' || (check[check.length-1]=='m' && check[check.length-2]=='o')){

           }else {
               System.out.println(nameIn+" -> "+email);
           }
           nameIn=sc.nextLine();
       }
    }

}
