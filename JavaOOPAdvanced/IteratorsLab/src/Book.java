import java.util.Arrays;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 15:39.
 */
public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    @Override
    public int compareTo(Book book) {

        return (this.title.compareTo(book.title)==0)?Integer.compare(book.getYear(),this.getYear()):this.title.compareTo(book.title);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.getTitle(), this.getYear(), String.join(", ",this.getAuthors()));
    }
}
