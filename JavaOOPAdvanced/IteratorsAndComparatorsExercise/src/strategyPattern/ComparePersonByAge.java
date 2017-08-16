package strategyPattern;



import java.util.Comparator;

/**
 * Created by Todor Popov using Lenovo on 28.3.2017 г. at 0:59.
 */
public class ComparePersonByAge implements Comparator<Person>{


    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge()-p2.getAge();
    }
}
