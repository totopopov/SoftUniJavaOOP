import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Todor Popov using Lenovo on 29.5.2017 г. at 22:57.
 */
public class date {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        DateFormat df=new SimpleDateFormat("dd-MM-yyyy");

        Date date= df.parse(scanner.nextLine());
        Date newDate=new Date(date.getTime()+ TimeUnit.DAYS.toMillis(999));
        System.out.println(df.format(newDate.getTime()));

    }
}
