package strategyPattern;



import java.util.Comparator;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 0:56.
 */
public class ComparePersonByName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
         int compare= p1.getName().length()- p2.getName().length();
        return compare==0?Character.compare(p1.getName().toLowerCase().charAt(0),
                p2.getName().toLowerCase().charAt(0)):compare;
    }
}
