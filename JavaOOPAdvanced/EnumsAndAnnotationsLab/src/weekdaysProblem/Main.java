package weekdaysProblem;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:16.
 */
public class Main {
    public static void main(String[] args) {

        WeeklyCalendarAble wc = new WeeklyCalendar();

        wc.addEntry("Friday","Sleep");
        wc.addEntry("Monday","Sport");

        for (WeeklyEntry entry : wc.getWeeklySchedule()) {
            System.out.println(entry.toString());
        }

    }
}
