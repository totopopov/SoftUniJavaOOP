package weekdaysProblem;

import java.util.ArrayList;
import java.util.List;

import static weekdaysProblem.WeeklyEntry.CalendarDailyEntryComparator;

/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:01.
 */
public class WeeklyCalendar  implements WeeklyCalendarAble{
    private List<WeeklyEntry> weekdays;

    public WeeklyCalendar() {
        this.weekdays = new ArrayList<>();
    }

    @Override
    public void addEntry(String weekday, String notes) {
        WeeklyEntry dailyEntry=new WeeklyEntry(weekday,notes);
        this.weekdays.add(dailyEntry);
    }

    @Override
    public Iterable<WeeklyEntry> getWeeklySchedule() {
        this.weekdays.sort(CalendarDailyEntryComparator);
        return this.weekdays;
    }



}
