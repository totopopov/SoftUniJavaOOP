package weekdaysProblem;

import java.util.Comparator;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:01.
 */
public class WeeklyEntry {
    public static final Comparator<WeeklyEntry> CalendarDailyEntryComparator= getComparator();

    private Weekday weekday;
    private String note;

    public WeeklyEntry(String weekday, String note) {
        this.weekday = Weekday.valueOf(weekday.toUpperCase());
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.weekday.toString(), this.note);
    }


    private static Comparator<WeeklyEntry> getComparator() {
        return Comparator.comparingInt(d -> d.weekday.ordinal());
    }
}
