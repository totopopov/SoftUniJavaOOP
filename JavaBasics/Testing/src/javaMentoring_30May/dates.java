package javaMentoring_30May;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;

/**
 * Created by Todor Popov using Lenovo on 30.5.2017 г. at 17:16.
 */
public class dates {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        DateFormat df=new SimpleDateFormat("dd-MMM-yyyy");

      Date date=df.parse(scanner.nextLine());

       Date newDate=new java.util.Date(date.getTime()+ TimeUnit.DAYS.toMillis(999));

        Date now = new java.util.Date();
        System.out.println(df.format(now));
    }
}
