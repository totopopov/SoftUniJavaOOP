import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Todor Popov using Lenovo on 21.3.2017 г. at 16:03.
 */
public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.setBooks(books);
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }


    public void setBooks(Book... books) {
        this.books = books;
    }

    private final class LibraryIterator implements Iterator<Book>{
        private int index;

        public LibraryIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index<books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }
    }

}
