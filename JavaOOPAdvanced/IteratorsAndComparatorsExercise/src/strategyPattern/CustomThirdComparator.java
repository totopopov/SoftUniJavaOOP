package strategyPattern;

import java.util.Comparator;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 1:32.
 */
public class CustomThirdComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int compareTo = p1.getName().compareTo(p2.getName());

        return compareTo==0?p1.getAge()-p2.getAge():compareTo;
    }
}
