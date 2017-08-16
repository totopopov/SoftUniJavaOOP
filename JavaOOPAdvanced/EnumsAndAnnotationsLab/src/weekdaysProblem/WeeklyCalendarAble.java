package weekdaysProblem;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:09.
 */
public interface WeeklyCalendarAble {

    void addEntry(String weekday, String notes);

    Iterable<WeeklyEntry> getWeeklySchedule();
}
