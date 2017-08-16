package weekdaysProblem;


/**
 * Created by Todor Popov using Lenovo on 23.3.2017 г. at 16:00.
 */
public enum  Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        String day=super.toString();
        return day.charAt(0)+day.toLowerCase().substring(1);
    }
}
