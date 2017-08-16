import java.util.Comparator;

/**
 * Created by Todor Popov using Lenovo on 22.3.2017 г. at 17:36.
 */
public class BookComparator implements Comparator<Book> {

    public BookComparator() {
    }

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getYear()-book2.getYear();
    }
}
